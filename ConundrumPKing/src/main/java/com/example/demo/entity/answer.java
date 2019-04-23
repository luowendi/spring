package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "answer")

public class answer {
    private  String in_id;
    private String  con_id;
    private  String an_date;

    public answer(){

    }

    public answer(String in_id, String con_id, String an_date, String an_content) {
        this.in_id = in_id;
        this.con_id = con_id;
        this.an_date = an_date;
        this.an_content = an_content;
    }

    private  String an_content;

    public String getIn_id() {
        return in_id;
    }

    public void setIn_id(String in_id) {
        this.in_id = in_id;
    }

    public String getCo_id() {
        return con_id;
    }

    public void setCo_id(String co_id) {
        this.con_id = co_id;
    }

    public String getAn_date() {
        return an_date;
    }

    public void setAn_date(String an_date) {
        this.an_date = an_date;
    }

    public String getAn_content() {
        return an_content;
    }

    public void setAn_content(String an_content) {
        this.an_content = an_content;
    }


}
