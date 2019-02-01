package com.example.ihubtechnologies.superdoc;

public class DataResPonse {
    /**
     * sid : 6
     * sDescription : Anesthesia
     * deptid : 0
     */

    private int sid;
    private String sDescription;
    private int deptid;

    public DataResPonse(int sid, String sDescription, int deptid) {
        this.sid = sid;
        this.sDescription = sDescription;
        this.deptid = deptid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSDescription() {
        return sDescription;
    }

    public void setSDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
