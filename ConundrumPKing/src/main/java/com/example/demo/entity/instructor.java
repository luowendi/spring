package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "instructor")
public class instructor {
    public instructor(String in_id, String in_name, int in_score, String in_department, String in_course) {
        this.in_id = in_id;
        this.in_name = in_name;
        this.in_score = in_score;
        this.in_department = in_department;
        this.in_course = in_course;
    }

    public instructor() {

    }

    public String getIn_id() {
        return in_id;
    }

    public void setIn_id(String in_id) {
        this.in_id = in_id;
    }

    public String getIn_name() {
        return in_name;
    }

    public void setIn_name(String in_name) {
        this.in_name = in_name;
    }

    public int getIn_score() {
        return in_score;
    }

    public void setIn_score(int in_score) {
        this.in_score = in_score;
    }

    public String getIn_department() {
        return in_department;
    }

    public void setIn_department(String in_department) {
        this.in_department = in_department;
    }

    public String getIn_course() {
        return in_course;
    }

    public void setIn_course(String in_course) {
        this.in_course = in_course;
    }

    private  String in_id;
    private String in_name;
    private int in_score;
    private String in_department;
    private String in_course;
}
