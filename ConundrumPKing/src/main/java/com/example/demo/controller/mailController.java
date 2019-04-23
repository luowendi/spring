package com.example.demo.controller;


import com.example.demo.serviceImpl.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping(value = "/mail")
public class mailController {

    @Autowired
    private MailService mailService;

    @RequestMapping(value ="/request",method = RequestMethod.GET)
    public void sendMail(@RequestParam("content") String content,@RequestParam("mailcode") String mailcode) throws MessagingException {
        String username=mailcode;
        String thiscontent=content;
        String subject ="这是学生对您解答的疑惑！";
        System.out.println(subject+mailcode);
        mailService.sendSimpleMail(username,subject,thiscontent);


        //发送html文件
//        String username ="1549211994@qq.com";
//        String content ="<html>\n"+"<body>\n"+"<h3>hello HTML文件</h3>\n"+
//                "</body>\n"+"</html>";
//        String subject ="这是Html文件";
//        System.out.println(username);
//        mailService.sendHtmlMail(username,subject,content);
////

        //发送附件
//        String filepath = "/Users/luowendi/Downloads/第三章3.2.pdf";
//        String username ="1549211994@qq.com";
//        String content ="这是带附件的文件";
//        String subject ="这是带附件的文件";
//        System.out.println(username);
//        mailService.sendAttachmentsMail(username,subject,content,filepath);

    }

}
