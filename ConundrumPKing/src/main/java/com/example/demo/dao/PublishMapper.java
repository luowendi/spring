package com.example.demo.dao;

import com.example.demo.entity.publish;

public interface PublishMapper {

    public void publishProblem(publish thispublish);

    public publish getPublishById(String con_id);

}
