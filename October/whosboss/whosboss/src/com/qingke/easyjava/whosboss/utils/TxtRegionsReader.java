package com.qingke.easyjava.whosboss.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qingke.easyjava.whosboss.bean.Region;

/**
 * The file reader for "WhosBoss" application. <br/>
 * The content line in the file which starts with "#" symbol will be ignored.
 * 
 * @author Qingke.me
 *
 */
public class TxtRegionsReader {

    private Map<String, Region> regionMap;

    /**
     * Read regions information from the file. The default file is "info.txt" in classpath.
     * @param filename the file name
     * @return the id-object mappings object
     */
    public Map<String, Region> readRegions(String filename){
        regionMap = new HashMap<>();

        // reset "filename" if it is null
        filename = (filename == null) ? "info.txt" : filename;
        try {
            List<String[]> valueList = parse(filename);
            
            for (String[] values : valueList) {
                Region region = constructRegion(values);
                
                regionMap.put(region.getId(), region);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return regionMap;
    }
    
    private Region constructRegion(String[] values) {
        // 1. get basic info
        String id = values[0];
        String name = values[1];
        String aveIncome = values[2];
        String superRegionId = values[3];
        String boss = (values.length == 5) ? values[4] : "";

        // construct region object
        Region region = regionMap.get(id);
        if (region == null) {
            region = new Region(id);
            regionMap.put(id, region);
        }
        
        region.setName(name);
        region.setAvgIncome(Double.parseDouble(aveIncome));
        region.setBoss(boss);
        
        // construct super region
        if (!"".equalsIgnoreCase(superRegionId)) {
            Region superRegion = regionMap.get(superRegionId);
            if (superRegion == null) {
                superRegion = new Region(superRegionId);
                regionMap.put(superRegionId, superRegion);
            }

            // construct relationship
            region.setSuperRegion(superRegion);
            superRegion.getChildRegions().add(region);
        }

        return region;
    }
    
    private List<String[]> parse(String file) throws IOException{
        List<String[]> valueList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(new File(file)));
        
        String line = null;
        
        while ((line = br.readLine()) != null) {
            if (line.startsWith("#")){
                continue;
            }

            String[] values = line.split(",");
            valueList.add(values);
        }
        
        br.close();
        
        return valueList;
    }
}
