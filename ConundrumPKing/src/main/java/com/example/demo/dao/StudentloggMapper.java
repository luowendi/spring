package com.example.demo.dao;

import com.example.demo.entity.instructor;
import com.example.demo.entity.student;
import com.example.demo.entity.student_account;

import java.util.List;

public interface StudentloggMapper {

    public student_account studentLog(String username);

    public void studentSignup(student_account thisstudent_account);

}
