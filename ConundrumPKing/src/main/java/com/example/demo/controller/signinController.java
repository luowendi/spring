package com.example.demo.controller;


import com.example.demo.entity.instructor;
import com.example.demo.entity.instructor_account;
import com.example.demo.entity.student;
import com.example.demo.entity.student_account;
import com.example.demo.service.InstructorService;
import com.example.demo.service.InstructorloggService;
import com.example.demo.service.StudentloggService;
import com.example.demo.serviceImpl.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.List;

@RestController
@RequestMapping(value ="/user")
public class signinController {

   @Autowired
   private StudentloggService studentloggService;

   @Autowired
   private InstructorloggService instructorloggService;

   @Autowired
   private MailService mailService;

   @Autowired
   private InstructorService instructorService;


    @RequestMapping(value="/signin",method = RequestMethod.POST)
    public Object signIn(@RequestParam("username") String username ,
                       @RequestParam("password") String password ,
                       @RequestParam("identity") String identity){

        System.out.println(identity);

     if("student".equals(identity)){
         student_account this_student_log =  studentloggService.studentLog(username);
         System.out.println(this_student_log.getPassword()+this_student_log.getUsername());
         if(this_student_log.getPassword().equals(password)){
             System.out.println("看看第一名是谁！");
             List<instructor> allrank = instructorService.getAllRank();
             String person="ID:"+allrank.get(0).getIn_id()+"|name:"+allrank.get(0).getIn_name()
                     +"|score:"+allrank.get(0).getIn_score()+"|department:"
                     +allrank.get(0).getIn_department()+"|course:"+allrank.get(0).getIn_course();
             //下面是播报第一名的业务代码
             try {
                 String myusername = "1548667396@qq.com";
                 System.out.println(myusername);
                 System.out.println(person);
                 String content = "<html>\n" + "<body>\n" + "<h3>看看答题的第一名老师是谁！</h3>\n"+ person +
                         "我的学习小助手" +
                         "</body>\n" + "</html>";
                 String subject = "叫我第一名！";
                 mailService.sendHtmlMail(myusername, subject, content);
                 System.out.println("邮件发送完成！");

             } catch (MessagingException e) {
                 e.printStackTrace();
             }


             return this_student_log;
         }
         else {
             return null;
         }
     }
     else if("teacher".equals(identity)){
         instructor_account this_teacher_log = instructorloggService.teacherLog(username);
         if(this_teacher_log.getPassword().equals(password)){
             System.out.println("看看第一名是谁！");
             return this_teacher_log;
         }
         else {
             return null;
         }
     }
     else{
            System.out.println("数据未被传输到后台！");
            return null;
        }
    }

}
