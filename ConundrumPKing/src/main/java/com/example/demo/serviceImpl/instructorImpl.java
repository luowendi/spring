package com.example.demo.serviceImpl;


import com.example.demo.dao.InstructorMapper;
import com.example.demo.entity.instructor;

import com.example.demo.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class instructorImpl implements InstructorService {


    @Autowired
    private InstructorMapper instructorMapper;

    @Override
    public instructor getInstructorById(String in_id){
        return instructorMapper.getInstructorById(in_id);
    }

    /**
     *
     * @param myteacher
     */
    @Override
    public void addScore(instructor myteacher)
    {
        instructorMapper.addScore(myteacher);
    }

    @Override
    public void modifyInstructorByid(instructor thisinstructor) {
        instructorMapper.modifyInstructorByid(thisinstructor);
    }

    @Override
    public List<instructor> getAllRank(){
       return instructorMapper.getAllRank();
    }


    @Override
    public void deleteInstructorByid(String in_id) {

        instructorMapper.deleteInstructorByid(in_id);
    }
}
