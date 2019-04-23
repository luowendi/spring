package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class student {

    public student() {
    }

    public student(String stu_id, String stu_name, String stu_department) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_department = stu_department;
    }

    private String stu_id;
     private String stu_name;
     private String stu_department;

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_department() {
        return stu_department;
    }

    public void setStu_department(String stu_department) {
        this.stu_department = stu_department;
    }
}
