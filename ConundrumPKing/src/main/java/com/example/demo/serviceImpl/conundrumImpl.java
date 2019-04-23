package com.example.demo.serviceImpl;

import com.example.demo.dao.ConundrumMapper;
import com.example.demo.entity.conundrum;
import com.example.demo.service.ConundrumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class conundrumImpl implements ConundrumService {

    @Autowired
    private ConundrumMapper conundrumMapper;

    @Override
    public List<conundrum> getAllconundrum() {

        return conundrumMapper.getAllconundrum();
    }

    public  void  addConundrum(conundrum thiscononundrum){
        conundrumMapper.addConundrum(thiscononundrum);
    }
}
