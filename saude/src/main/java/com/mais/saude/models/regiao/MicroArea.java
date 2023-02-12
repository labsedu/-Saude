package com.mais.saude.models.regiao;

import java.util.*;

public class MicroArea {
    
    private Integer ID;
    private List<Area> areas;
    private String microArea;
    
    /*********************************/
    public MicroArea() {
    }
    public MicroArea(List<Area> areas, String microArea) {
        this.areas = areas;
        this.microArea = microArea;
    }
    
    /*********************************/
    public List<Area> getAreas() {
        return areas;
    }
    public void setID(Integer iD) {
        ID = iD;
    }
    public String getMicroArea() {
        return microArea;
    }

    /*********************************/
    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
    public void setMicroArea(String microArea) {
        this.microArea = microArea;
    }/*********************************/
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ID == null) ? 0 : ID.hashCode());
        result = prime * result + ((areas == null) ? 0 : areas.hashCode());
        result = prime * result + ((microArea == null) ? 0 : microArea.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MicroArea other = (MicroArea) obj;
        if (ID == null) {
            if (other.ID != null)
                return false;
        } else if (!ID.equals(other.ID))
            return false;
        if (areas == null) {
            if (other.areas != null)
                return false;
        } else if (!areas.equals(other.areas))
            return false;
        if (microArea == null) {
            if (other.microArea != null)
                return false;
        } else if (!microArea.equals(other.microArea))
            return false;
        return true;
    }
    
    /*********************************/
    @Override
    public String toString() {
        return "MicroArea [ID=" + ID + ", areas=" + areas + ", microArea=" + microArea + "]";
    }

    /*********************************/
}
