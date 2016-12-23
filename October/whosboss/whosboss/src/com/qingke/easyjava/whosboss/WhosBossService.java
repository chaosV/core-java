package com.qingke.easyjava.whosboss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.qingke.easyjava.whosboss.bean.MessageConstants;
import com.qingke.easyjava.whosboss.bean.Region;
import com.qingke.easyjava.whosboss.bean.UserCommand;
import com.qingke.easyjava.whosboss.utils.QingkeConsole;
import com.qingke.easyjava.whosboss.utils.QingkeUtil;

/**
 * The service for the "WhosBoss" application.
 * @author Qingke.me
 */
public class WhosBossService {

    private String sortingMode = "id";
    private Map<String, Region> regionMap;
    private List<Region> regionTree = new ArrayList<>();

    /**
     * Constructor method with data.
     * @param regionMap the region data
     */
    public WhosBossService(Map<String, Region> regionMap) {
        this.regionMap = regionMap;

        for (Region region : regionMap.values()) {
            if (region.getSuperRegion() == null) {
                regionTree.add(region);
            }
        }
    }

    /**
     * Execute the user's command.
     * @param command the instance of the user command
     */
    public void executeCommand(UserCommand command) {

        if ("exit".equalsIgnoreCase(command.getName())) {
            QingkeConsole.println(MessageConstants.MESSAGE_GOODBYE);
            System.exit(0);
        }

        if ("help".equalsIgnoreCase(command.getName())) {
            doPrintUsage();
        } else if ("ls".equalsIgnoreCase(command.getName())) {
            doList(command.getMode(), command.getParams());
        } else if ("find".equalsIgnoreCase(command.getName())) {
            doFind(command.getMode(), command.getParams());
        } else if ("sort".equalsIgnoreCase(command.getName())) {
            doSort(command.getMode());
        }
    }

    private void doPrintUsage() {
        QingkeConsole.println(MessageConstants.MESSAGE_USAGE);
        QingkeConsole.println("= exit: 退出程序");
        QingkeConsole.println("= ls [-all] [ID]: 打印[详细]地区基本信息");
        QingkeConsole.println("= find [-name|-salary] [value]: 按[名字|平均收入]查找并打印地区基本信息");
        QingkeConsole.println("=     find -name 江: 查找名字中带有”江“字的所有地区");
        QingkeConsole.println("=     find -salary 1000: 查找平均收入高于1000之间的地区");
        QingkeConsole.println("=     find -salary 0~1000: 查找平均收入在0~1000之间的地区");
        QingkeConsole.println("= sort [-name|-salary]: 按[名字|平均收入]查找并打印地区基本信息");
    }

    private void doList(String mode, String[] params) {
        List<Region> printRegions = new ArrayList<>();

        if (!QingkeUtil.isNullorEmpty(mode) && !isAllMode(mode)) {
            QingkeConsole.println(MessageConstants.WARN_INVALID_ARGUMENTS);
            doPrintUsage();
            return;
        }

        if (QingkeUtil.isNullorEmpty(params)) {
            printRegions = new ArrayList<>(regionMap.values());

            if (isAllMode(mode)) {
                printRegions = regionTree;
            }
        } else {
            for (String id : params) {
                Region region = regionMap.get(id);
                if (region != null) {
                    printRegions.add(region);
                }
            }
        }
        Collections.sort(printRegions, getComparatorByMode(sortingMode));
        for (Region region : printRegions) {
            if (isAllMode(mode)) {
                QingkeConsole.println(region.toCompleteString(""));
            } else {
                QingkeConsole.println(region.toString());
            }
        }
    }

    private void doFind(String mode, String[] params) {
        if (QingkeUtil.isNullorEmpty(params) || !QingkeUtil.isValidValue(mode, new String[]{"name", "salary"})) {
            QingkeConsole.println(MessageConstants.WARN_INVALID_ARGUMENTS);
            doPrintUsage();
            return;
        }

        List<Region> foundRegions = new ArrayList<>();
        if ("name".equalsIgnoreCase(mode)) {
            foundRegions = findRegionByName(params);
        } else if ("salary".equalsIgnoreCase(mode)) {
            foundRegions = findRegionBySalary(params[0]);
        }

        for (Region region : foundRegions) {
            QingkeConsole.println(region.toString());
        }
    }

    private void doSort(String mode) {
        if (QingkeUtil.isNullorEmpty(mode)) {
            QingkeConsole.println("未指明排序方式，默认按ID排序！");
            mode = "id";
        }

        Comparator<Region> comparator = getComparatorByMode(mode);
        if (comparator == null) {
            QingkeConsole.println(MessageConstants.WARN_INVALID_ARGUMENTS);
            doPrintUsage();
            return;
        }

        List<Region> regionList = new ArrayList<>(regionMap.values());
        Collections.sort(regionList, comparator);

        sortingMode = mode;
        doList(null, null);
    }

    private List<Region> findRegionByName(String[] names) {
        List<Region> regions = new ArrayList<>();
        for (Region region : regionMap.values()) {
            for (String name : names) {
                if (region.getName().contains(name)) {
                    regions.add(region);
                }
            }
        }

        return regions;
    }

    private List<Region> findRegionBySalary(String salaryRange) {
        List<Region> regions = new ArrayList<>();

        String[] ranges = salaryRange.split("~");
        double from = 0;

        try {
            from = Double.parseDouble(ranges[0]);
        } catch (Exception e) {
        }

        double to = Double.MAX_VALUE;

        try {
            to = Double.parseDouble(ranges[1]);
        } catch (Exception e) {
        }

        for (Region region : regionMap.values()) {
            double avgIncome = region.getAvgIncome();

            if (avgIncome >= from && avgIncome <= to) {
                regions.add(region);
            }
        }
        return regions;
    }

    private Comparator<Region> getComparatorByMode(String mode) {
        Comparator<Region> comparator = null;

        if ("id".equals(mode)) {
            comparator = new IdComparator();
        } else if ("name".equalsIgnoreCase(mode)) {
            comparator = new NameComparator();
        } else if ("salary".equalsIgnoreCase(mode)) {
            comparator = new SalaryComparator();
        }
        return comparator;
    }

    private class IdComparator implements Comparator<Region> {

        @Override
        public int compare(Region o1, Region o2) {
            String id1 = o1.getId();
            String id2 = o2.getId();

            return id1.compareTo(id2);
        }
    }

    private class NameComparator implements Comparator<Region> {

        @Override
        public int compare(Region o1, Region o2) {
            String name1 = o1.getName();
            String name2 = o2.getName();

            return name1.compareTo(name2);
        }
    }

    private class SalaryComparator implements Comparator<Region> {

        @Override
        public int compare(Region o1, Region o2) {
            double avg1 = o1.getAvgIncome();
            double avg2 = o2.getAvgIncome();

            if (avg1 > avg2) {
                return 1;
            }
            if (avg1 < avg2) {
                return -1;
            }
            return 0;
        }
    }

    private boolean isAllMode(String mode) {
        return "all".equalsIgnoreCase(mode);
    }
}
