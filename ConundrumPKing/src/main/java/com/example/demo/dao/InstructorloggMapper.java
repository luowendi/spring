package com.example.demo.dao;

import com.example.demo.entity.instructor;
import com.example.demo.entity.instructor_account;

import java.util.List;

public interface InstructorloggMapper {

    public instructor_account teacherLog(String in_id);

    public void instructorSignup(instructor_account thisteacher_account);
}
