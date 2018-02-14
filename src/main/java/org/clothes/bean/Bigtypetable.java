package org.clothes.bean;

public class Bigtypetable {
    private Integer bigtypeid;

    private String bigtypename;

    public Integer getBigtypeid() {
        return bigtypeid;
    }

    public void setBigtypeid(Integer bigtypeid) {
        this.bigtypeid = bigtypeid;
    }

    public String getBigtypename() {
        return bigtypename;
    }

    public void setBigtypename(String bigtypename) {
        this.bigtypename = bigtypename == null ? null : bigtypename.trim();
    }
}