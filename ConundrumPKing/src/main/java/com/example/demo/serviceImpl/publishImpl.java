package com.example.demo.serviceImpl;

import com.example.demo.dao.PublishMapper;
import com.example.demo.entity.publish;
import com.example.demo.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class publishImpl implements PublishService {

    @Autowired
    public PublishMapper publishMapper;

    @Override
    public void publishProblem(publish thispublish){

        publishMapper.publishProblem(thispublish);
    }

    @Override
    public publish getPublishById(String stu_id) {
      return   publishMapper.getPublishById(stu_id);
    }
}
