package com.example.demo.controller;

import com.example.demo.entity.instructor;
import com.example.demo.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rank")
public class rankController {

    @Autowired
    private InstructorService instructorService;


    /**
     * 返回所有的等级排序降序（成绩由低到高）
     * @return
     */
    @RequestMapping(value="/showRank",method = RequestMethod.GET)
    public List<instructor> showAll(){

        return instructorService.getAllRank();
    }

}
