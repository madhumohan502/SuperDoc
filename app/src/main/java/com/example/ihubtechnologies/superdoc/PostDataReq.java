package com.example.ihubtechnologies.superdoc;

class PostDataReq {

    /**
     * loc_Id : 1
     * dept_Id : 7
     */

    private int loc_Id;
    private int dept_Id;

    public PostDataReq(int loc_Id, int dept_Id) {
        this.loc_Id = loc_Id;
        this.dept_Id = dept_Id;
    }

    public int getLoc_Id() {
        return loc_Id;
    }

    public void setLoc_Id(int loc_Id) {
        this.loc_Id = loc_Id;
    }

    public int getDept_Id() {
        return dept_Id;
    }

    public void setDept_Id(int dept_Id) {
        this.dept_Id = dept_Id;
    }
}
