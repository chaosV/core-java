package com.qingke.easyjava.whosboss.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * The value object for holding Region infomation.
 * 
 * @author Qingke.me
 */
public class Region {

    private String id;
    private String name;
    private String boss;
    private double avgIncome;
    private Region superRegion;
    private List<Region> childRegions;

    public Region() {
        childRegions = new ArrayList<Region>();
    }

    public Region(String id) {
        this();

        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public double getAvgIncome() {
        return avgIncome;
    }

    public void setAvgIncome(double avgIncome) {
        this.avgIncome = avgIncome;
    }

    public Region getSuperRegion() {
        return superRegion;
    }

    public void setSuperRegion(Region belongTo) {
        this.superRegion = belongTo;
    }

    public List<Region> getChildRegions() {
        return childRegions;
    }

    public void setChildRegions(List<Region> childRegions) {
        this.childRegions = childRegions;
    }

    /**
     * Output the region information with the child regions.
     * @param prefix the prefix for the print format
     * @return the string value of the region information
     */
    public String toCompleteString(String prefix) {
        StringBuilder sb = new StringBuilder();

        sb.append(prefix);
        sb.append("[地区ID：" + id + "， 名称：" + name + "， 平均收入：" + avgIncome + "， 老板：" + boss + "]\n");
        for (Region childRegion : childRegions) {
            sb.append(childRegion.toCompleteString(prefix + "    "));
        }

        return sb.toString();
    }

    /**
     * The simple information for the region
     */
    public String toString(){
        return "[地区ID：" + id + "， 名称：" + name + "， 平均收入：" + avgIncome + "， 老板：" + boss + "]";
    }
}
