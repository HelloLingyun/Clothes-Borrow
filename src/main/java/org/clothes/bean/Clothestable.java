package org.clothes.bean;

public class Clothestable {
    private Integer clothesid;

    private Integer bigtypeid;

    private Integer smalltypeid;

    private Integer clothesnum;

    private String cothesname;

    private String cothesdesc;

    private String clothespic;

    private String clothessize;

    private Float clothesprice;

    private String clothesflag;

    private String clothesremark;

    public Integer getClothesid() {
        return clothesid;
    }

    public void setClothesid(Integer clothesid) {
        this.clothesid = clothesid;
    }

    public Integer getBigtypeid() {
        return bigtypeid;
    }

    public void setBigtypeid(Integer bigtypeid) {
        this.bigtypeid = bigtypeid;
    }

    public Integer getSmalltypeid() {
        return smalltypeid;
    }

    public void setSmalltypeid(Integer smalltypeid) {
        this.smalltypeid = smalltypeid;
    }

    public Integer getClothesnum() {
        return clothesnum;
    }

    public void setClothesnum(Integer clothesnum) {
        this.clothesnum = clothesnum;
    }

    public String getCothesname() {
        return cothesname;
    }

    public void setCothesname(String cothesname) {
        this.cothesname = cothesname == null ? null : cothesname.trim();
    }

    public String getCothesdesc() {
        return cothesdesc;
    }

    public void setCothesdesc(String cothesdesc) {
        this.cothesdesc = cothesdesc == null ? null : cothesdesc.trim();
    }

    public String getClothespic() {
        return clothespic;
    }

    public void setClothespic(String clothespic) {
        this.clothespic = clothespic == null ? null : clothespic.trim();
    }

    public String getClothessize() {
        return clothessize;
    }

    public void setClothessize(String clothessize) {
        this.clothessize = clothessize == null ? null : clothessize.trim();
    }

    public Float getClothesprice() {
        return clothesprice;
    }

    public void setClothesprice(Float clothesprice) {
        this.clothesprice = clothesprice;
    }

    public String getClothesflag() {
        return clothesflag;
    }

    public void setClothesflag(String clothesflag) {
        this.clothesflag = clothesflag == null ? null : clothesflag.trim();
    }

    public String getClothesremark() {
        return clothesremark;
    }

    public void setClothesremark(String clothesremark) {
        this.clothesremark = clothesremark == null ? null : clothesremark.trim();
    }
}