package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "publish")
public class publish {
    private String stu_id;
    private String con_id;
    private String date;

    public publish(String stu_id, String con_id, String date) {
        this.stu_id = stu_id;
        this.con_id = con_id;
        this.date = date;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getCon_id() {
        return con_id;
    }

    public void setCon_id(String con_id) {
        this.con_id = con_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
