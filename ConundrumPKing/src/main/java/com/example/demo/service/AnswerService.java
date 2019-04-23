package com.example.demo.service;

import com.example.demo.entity.answer;

public interface AnswerService {

    public void resolveProblem(answer myanswer);

    public answer getAnswerById(String con_id);
}
