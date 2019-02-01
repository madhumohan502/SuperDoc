package com.example.ihubtechnologies.superdoc;

import java.util.List;

class PostDataResponce {

    /**
     * doctor_Id : EMP076
     * doctor_Name : DR.PRASHANTH
     * doctor_Fee : 300
     * doctor_Speciality : ["Cardiology"]
     * doctor_Profile_Img : null
     * doctor_Experience : 0
     * doctor_Department : ["Cardiology"]
     * doctor_studies : null
     */

    private String doctor_Id;
    private String doctor_Name;
    private int doctor_Fee;
    private Object doctor_Profile_Img;
    private String doctor_Experience;
    private Object doctor_studies;
    private List<String> doctor_Speciality;
    private List<String> doctor_Department;

    public PostDataResponce(String doctor_Id, String doctor_Name, int doctor_Fee, Object doctor_Profile_Img, String doctor_Experience, Object doctor_studies, List<String> doctor_Speciality, List<String> doctor_Department) {
        this.doctor_Id = doctor_Id;
        this.doctor_Name = doctor_Name;
        this.doctor_Fee = doctor_Fee;
        this.doctor_Profile_Img = doctor_Profile_Img;
        this.doctor_Experience = doctor_Experience;
        this.doctor_studies = doctor_studies;
        this.doctor_Speciality = doctor_Speciality;
        this.doctor_Department = doctor_Department;
    }

    public String getDoctor_Id() {
        return doctor_Id;
    }

    public void setDoctor_Id(String doctor_Id) {
        this.doctor_Id = doctor_Id;
    }

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public int getDoctor_Fee() {
        return doctor_Fee;
    }

    public void setDoctor_Fee(int doctor_Fee) {
        this.doctor_Fee = doctor_Fee;
    }

    public Object getDoctor_Profile_Img() {
        return doctor_Profile_Img;
    }

    public void setDoctor_Profile_Img(Object doctor_Profile_Img) {
        this.doctor_Profile_Img = doctor_Profile_Img;
    }

    public String getDoctor_Experience() {
        return doctor_Experience;
    }

    public void setDoctor_Experience(String doctor_Experience) {
        this.doctor_Experience = doctor_Experience;
    }

    public Object getDoctor_studies() {
        return doctor_studies;
    }

    public void setDoctor_studies(Object doctor_studies) {
        this.doctor_studies = doctor_studies;
    }

    public List<String> getDoctor_Speciality() {
        return doctor_Speciality;
    }

    public void setDoctor_Speciality(List<String> doctor_Speciality) {
        this.doctor_Speciality = doctor_Speciality;
    }

    public List<String> getDoctor_Department() {
        return doctor_Department;
    }

    public void setDoctor_Department(List<String> doctor_Department) {
        this.doctor_Department = doctor_Department;
    }
}
