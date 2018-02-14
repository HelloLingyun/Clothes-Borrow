package org.clothes.bean;

public class Smalltypetable {
    private Integer smalltypeid;

    private Integer bigtypeid;

    private String smalltypename;

    public Integer getSmalltypeid() {
        return smalltypeid;
    }

    public void setSmalltypeid(Integer smalltypeid) {
        this.smalltypeid = smalltypeid;
    }

    public Integer getBigtypeid() {
        return bigtypeid;
    }

    public void setBigtypeid(Integer bigtypeid) {
        this.bigtypeid = bigtypeid;
    }

    public String getSmalltypename() {
        return smalltypename;
    }

    public void setSmalltypename(String smalltypename) {
        this.smalltypename = smalltypename == null ? null : smalltypename.trim();
    }
}