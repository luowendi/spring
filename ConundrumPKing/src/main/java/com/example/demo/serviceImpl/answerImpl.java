package com.example.demo.serviceImpl;

import com.example.demo.dao.AnswerMapper;
import com.example.demo.entity.answer;
import com.example.demo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class answerImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public void resolveProblem(answer myanswer) {

      answerMapper.resolveProblem(myanswer);
    }

    @Override
    public answer getAnswerById(String con_id) {
        return  answerMapper.getAnswerById(con_id);
    }
}
