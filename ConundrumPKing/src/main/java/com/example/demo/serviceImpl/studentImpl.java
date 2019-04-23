package com.example.demo.serviceImpl;

import com.example.demo.dao.StudentMapper;
import com.example.demo.entity.student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentImpl implements StudentService {

     @Autowired
     private StudentMapper studentMapper;


    @Override
    public void modifyStudentByid(student thisstudent) {
       studentMapper.modifyStudentByid(thisstudent);
    }


    @Override
    public void deleteStudentByid(String stu_id) {
        studentMapper.deleteStudentByid(stu_id);
    }
}
