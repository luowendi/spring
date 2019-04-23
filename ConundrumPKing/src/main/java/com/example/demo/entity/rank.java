package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rank")
public class rank {
     private int rank_id;
     private String in_id;
     private String in_name;
     private String in_department;
     private String in_course;

    public int getRank_id() {
        return rank_id;
    }

    public void setRank_id(int rank_id) {
        this.rank_id = rank_id;
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
}
