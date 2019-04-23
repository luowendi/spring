package com.example.demo.service;

import com.example.demo.entity.publish;
import org.springframework.stereotype.Service;


public interface PublishService {

    public void publishProblem(publish thispublish);

    public publish getPublishById(String stu_id);

}
