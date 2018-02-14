package org.clothes.bean;

import java.util.Date;

public class Admintable {
    private Integer adminid;

    private String adminname;

    private String adminpass;

    private String adminnickname;

    private Date admincreatetime;

    private String adminlevel;

    private String adminspare1;

    private String adminspare2;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass == null ? null : adminpass.trim();
    }

    public String getAdminnickname() {
        return adminnickname;
    }

    public void setAdminnickname(String adminnickname) {
        this.adminnickname = adminnickname == null ? null : adminnickname.trim();
    }

    public Date getAdmincreatetime() {
        return admincreatetime;
    }

    public void setAdmincreatetime(Date admincreatetime) {
        this.admincreatetime = admincreatetime;
    }

    public String getAdminlevel() {
        return adminlevel;
    }

    public void setAdminlevel(String adminlevel) {
        this.adminlevel = adminlevel == null ? null : adminlevel.trim();
    }

    public String getAdminspare1() {
        return adminspare1;
    }

    public void setAdminspare1(String adminspare1) {
        this.adminspare1 = adminspare1 == null ? null : adminspare1.trim();
    }

    public String getAdminspare2() {
        return adminspare2;
    }

    public void setAdminspare2(String adminspare2) {
        this.adminspare2 = adminspare2 == null ? null : adminspare2.trim();
    }
}