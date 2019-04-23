package com.example.demo.dao;

import com.example.demo.entity.student;

public interface StudentMapper {

    public void modifyStudentByid(student thisstudent);

    public void deleteStudentByid(String stu_id);

}
