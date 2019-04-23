package com.example.demo.service;


import com.example.demo.entity.student_account;

import java.util.List;

public interface StudentloggService {

    public student_account studentLog(String stu_id);

    public void studentSignup(student_account thisstudent_account);
}
