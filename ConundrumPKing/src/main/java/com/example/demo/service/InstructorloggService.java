package com.example.demo.service;

import com.example.demo.entity.instructor;
import com.example.demo.entity.instructor_account;


import java.util.List;

public interface InstructorloggService {

    public instructor_account teacherLog(String in_id);

    public void instructoeSignup(instructor_account thisteacher_account);
}
