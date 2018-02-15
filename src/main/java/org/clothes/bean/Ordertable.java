package org.clothes.bean;

import java.util.Date;

public class Ordertable {
    private Integer orderid;

    private Integer clothesid;

    private Integer ordernum;

    private String clientname;

    private String clientdep;

    private String clientmaj;

    private String clientclass;

    private String clientnum;

    private String clienttel;

    private Date orderstarttime;

    private Date orderendtime;

    private Integer orderstatus;

    private Integer orderflag;

    private Date ordercreatetime;

    private String orderremark;

    private String operationer;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getClothesid() {
        return clothesid;
    }

    public void setClothesid(Integer clothesid) {
        this.clothesid = clothesid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClientdep() {
        return clientdep;
    }

    public void setClientdep(String clientdep) {
        this.clientdep = clientdep == null ? null : clientdep.trim();
    }

    public String getClientmaj() {
        return clientmaj;
    }

    public void setClientmaj(String clientmaj) {
        this.clientmaj = clientmaj == null ? null : clientmaj.trim();
    }

    public String getClientclass() {
        return clientclass;
    }

    public void setClientclass(String clientclass) {
        this.clientclass = clientclass == null ? null : clientclass.trim();
    }

    public String getClientnum() {
        return clientnum;
    }

    public void setClientnum(String clientnum) {
        this.clientnum = clientnum == null ? null : clientnum.trim();
    }

    public String getClienttel() {
        return clienttel;
    }

    public void setClienttel(String clienttel) {
        this.clienttel = clienttel == null ? null : clienttel.trim();
    }

    public Date getOrderstarttime() {
        return orderstarttime;
    }

    public void setOrderstarttime(Date orderstarttime) {
        this.orderstarttime = orderstarttime;
    }

    public Date getOrderendtime() {
        return orderendtime;
    }

    public void setOrderendtime(Date orderendtime) {
        this.orderendtime = orderendtime;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Integer getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(Integer orderflag) {
        this.orderflag = orderflag;
    }

    public Date getOrdercreatetime() {
        return ordercreatetime;
    }

    public void setOrdercreatetime(Date ordercreatetime) {
        this.ordercreatetime = ordercreatetime;
    }

    public String getOrderremark() {
        return orderremark;
    }

    public void setOrderremark(String orderremark) {
        this.orderremark = orderremark == null ? null : orderremark.trim();
    }

    public String getOperationer() {
        return operationer;
    }

    public void setOperationer(String operationer) {
        this.operationer = operationer == null ? null : operationer.trim();
    }
}