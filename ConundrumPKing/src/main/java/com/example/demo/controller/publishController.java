package com.example.demo.controller;

import com.example.demo.entity.conundrum;
import com.example.demo.entity.publish;
import com.example.demo.service.ConundrumService;
import com.example.demo.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value = "/publish")
public class publishController {

    @Autowired
    private PublishService publishService;

    @Autowired
    private ConundrumService conundrumService;

   // http://localhost:8081/publish/publishConundrum?con_id=222&con_department=d2&con_course=eq&con_score=eq&con_content=eq&stu_id=1163710104

    @RequestMapping(value="/publishConundrum",method = RequestMethod.GET)
    public publish publishConundrum(@RequestParam("con_id") String con_id,
            @RequestParam("con_department") String con_department,
            @RequestParam("con_course") String con_course,
            @RequestParam("con_score")  int con_score,
            @RequestParam("con_content") String con_content,
            @RequestParam("stu_id") String stu_id) {

        String currenttime= new SimpleDateFormat().format(new Date()).toString();
        conundrum thisconundrum = new conundrum(con_id,con_department,con_course,con_score,con_content,currenttime);
        conundrumService.addConundrum(thisconundrum);
        publish thispublish = new publish(stu_id,con_id,currenttime);
        publishService.publishProblem(thispublish);
        publish thispublishreturn = publishService.getPublishById(con_id);

        return thispublishreturn;
    }


//    public boolean



}
