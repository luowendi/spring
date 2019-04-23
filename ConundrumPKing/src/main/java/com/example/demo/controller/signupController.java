package com.example.demo.controller;


import com.example.demo.entity.instructor_account;
import com.example.demo.entity.student_account;
import com.example.demo.service.InstructorloggService;
import com.example.demo.service.StudentloggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/signup")
public class signupController {

  @Autowired
  private InstructorloggService instructorloggService;

  @Autowired
  private StudentloggService studentloggService;

    @RequestMapping(value="/PeopleSignup",method = RequestMethod.GET)
    public void PeopleSignup(@RequestParam("username") String username ,
                         @RequestParam("password") String password ,
                         @RequestParam("identity") String identity){

        System.out.println(identity);
        if("student".equals(identity)){
            student_account this_student_log = new student_account(username,password);
            studentloggService.studentSignup(this_student_log);
        }
        else if("teacher".equals(identity)){
            instructor_account this_teacher_log = new instructor_account(username,password);
            instructorloggService.instructoeSignup(this_teacher_log);
        }
        else{
            System.out.println("数据未被传输到后台！");
        }
    }

}
