package com.example.demo.serviceImpl;

import com.example.demo.dao.InstructorloggMapper;
import com.example.demo.entity.instructor;
import com.example.demo.entity.instructor_account;
import com.example.demo.service.InstructorloggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class instructorLoggImpl  implements InstructorloggService {

    @Autowired
    private InstructorloggMapper instructorloggMapper;

    public instructor_account teacherLog(String in_id){
        return instructorloggMapper.teacherLog(in_id);
    }


    @Override
    public void instructoeSignup(instructor_account thisteacher_account) {
        instructorloggMapper.instructorSignup(thisteacher_account);
    }
}
