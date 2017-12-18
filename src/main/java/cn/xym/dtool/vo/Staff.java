package cn.xym.dtool.vo;

public class Staff {
    private Integer staffid;
    private String staffname;
    private String loginname;
    private String loginpwd;
    private String lastmac;

    public String getLastmac() {
        return lastmac;
    }

    public void setLastmac(String lastmac) {
        this.lastmac = lastmac;
    }

    public Integer getStaffid() { return staffid; }

    public String getStaffname() {
        return staffname;
    }

    public String getLoginname() {
        return loginname;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }
}
