package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "conundrum")
public class conundrum {

    public conundrum(){}

    public conundrum(String con_id, String con_department, String con_course, int con_score, String con_content, String con_date) {
        this.con_id = con_id;
        this.con_department = con_department;
        this.con_course = con_course;
        this.con_score = con_score;
        this.con_content = con_content;
        this.con_date = con_date;
    }

    public String getCon_id() {
        return con_id;
    }

    public void setCon_id(String con_id) {
        this.con_id = con_id;
    }

    public String getCon_department() {
        return con_department;
    }

    public void setCon_department(String con_department) {
        this.con_department = con_department;
    }

    public String getCon_course() {
        return con_course;
    }

    public void setCon_course(String con_course) {
        this.con_course = con_course;
    }

    public int getCon_score() {
        return con_score;
    }

    public void setCon_score(int con_score) {
        this.con_score = con_score;
    }

    public String getCon_content() {
        return con_content;
    }

    public void setCon_content(String con_content) {
        this.con_content = con_content;
    }

    public String getCon_date() {
        return con_date;
    }

    public void setCon_date(String con_date) {
        this.con_date = con_date;
    }

    private String con_id;
     private String con_department;
     private String con_course;
     private int    con_score;
     private String con_content;
     private String con_date;
}
