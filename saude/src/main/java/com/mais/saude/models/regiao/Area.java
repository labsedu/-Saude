package com.mais.saude.models.regiao;

import java.util.List;

public class Area {
    private Integer ID;
    private String area;
    private List<MicroArea> microareas;
    
    /*********************************/
    public Area() {
    }
    public Area(String area) {
        this.area = area;
    }
    public Area(String area, List<MicroArea> microareas) {
        this.area = area;
        this.microareas = microareas;
    }
    
    /*********************************/
    public Integer getID() {
        return ID;
    }
    public String getArea() {
        return area;
    }
    public List<MicroArea> getMicroareas() {
        return microareas;
    }

    /*********************************/
    public void setArea(String area) {
        this.area = area;
    }
    public void setMicroareas(List<MicroArea> microareas) {
        this.microareas = microareas;
    }

    /*********************************/
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ID == null) ? 0 : ID.hashCode());
        result = prime * result + ((area == null) ? 0 : area.hashCode());
        result = prime * result + ((microareas == null) ? 0 : microareas.hashCode());
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
        Area other = (Area) obj;
        if (ID == null) {
            if (other.ID != null)
                return false;
        } else if (!ID.equals(other.ID))
            return false;
        if (area == null) {
            if (other.area != null)
                return false;
        } else if (!area.equals(other.area))
            return false;
        if (microareas == null) {
            if (other.microareas != null)
                return false;
        } else if (!microareas.equals(other.microareas))
            return false;
        return true;
    }

    /*********************************/
    @Override
    public String toString() {
        return "Area [ID=" + ID + ", area=" + area + ", microareas=" + microareas + "]";
    }
    
    /*********************************/
    public void adicionararea(String area) {

    }

}
