package com.example.demo.serviceImpl;

import com.example.demo.dao.StudentloggMapper;
import com.example.demo.entity.student;
import com.example.demo.entity.student_account;
import com.example.demo.service.StudentloggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentLoggImpl implements StudentloggService {

    @Autowired
    private StudentloggMapper studentloggMapper;

    public student_account studentLog(String stu_id){

        return studentloggMapper.studentLog(stu_id);
    }

    @Override
    public void studentSignup(student_account thisstudent_account) {
        studentloggMapper.studentSignup(thisstudent_account);
    }
}
