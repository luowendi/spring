package com.example.demo.dao;

import com.example.demo.entity.answer;

public interface AnswerMapper {

    public void resolveProblem(answer myanswer);

    public answer getAnswerById(String con_id);
}

