package com.example.demo.controller;

import com.example.demo.entity.answer;
import com.example.demo.entity.instructor;
import com.example.demo.service.AnswerService;
import com.example.demo.service.InstructorService;
import com.example.demo.serviceImpl.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value = "/answer")
public class answerController {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/answerQuestion", method = RequestMethod.GET)
    public String answerQuestion(@RequestParam("in_id") String in_id,
                                 @RequestParam("con_id") String con_id,
                                 @RequestParam("an_content") String an_content,
                                 @RequestParam("con_score") int con_score,
                                 @RequestParam("mailcode") String mailcode) {

        /*
        var url = "http://localhost:8081/answer/answerQuestion?con_id=" + con.con_id +
                "&an_content=" + text + "&in_id=" + in_id + "&con_score=" + con.con_score+'&mailcode='+mailcode;
        */



        instructor myteacher = instructorService.getInstructorById(in_id);

        int temp = myteacher.getIn_score() + con_score;
        myteacher.setIn_score(temp);
        instructorService.addScore(myteacher); //upadte数据更新

        // 下面解决的是解决问题

        String nowdate = new SimpleDateFormat().format(new Date()).toString();
        answer thisanswer = new answer(in_id, con_id, nowdate, an_content);
        System.out.println(thisanswer);
        System.out.println(thisanswer.getCo_id() + thisanswer.getAn_content());
        answerService.resolveProblem(thisanswer);

      //  解决完问题后给对应的用户发邮件，应为邮件我只知道我一个，就设定为自己吧！
        try {
            String myusername = mailcode;
            System.out.println(myusername);
            String content = "<html>\n" + "<body>\n" + "<h3>你发布的题目被回答了</h3>\n" +
                    "<h3>来看看老师给你写了啥！</h3>" +
                    "我的学习小助手" +
                    "</body>\n" + "</html>";
            String subject = "您的题目被回答了！";
            mailService.sendHtmlMail(myusername, subject, content);
            System.out.println("邮件发送完成！");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return"success";
}

    @RequestMapping(value = "/getDetails", method = RequestMethod.GET)
    public answer getDetails(@RequestParam("con_id") String con_id) {
        answer thisanswer = answerService.getAnswerById(con_id);
        return thisanswer;
    }
}