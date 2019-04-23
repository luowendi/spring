package com.example.demo.controller;

import com.example.demo.dao.ConundrumMapper;
import com.example.demo.entity.conundrum;
import com.example.demo.service.ConundrumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/home")
public class homepageController {

    @Autowired
    private ConundrumService conundrumService;

    @RequestMapping(value="/showAll",method = RequestMethod.GET)
    public List<conundrum> showAll(){
        return conundrumService.getAllconundrum();
    }


}
