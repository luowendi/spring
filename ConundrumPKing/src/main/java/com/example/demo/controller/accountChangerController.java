package com.example.demo.controller;

import com.example.demo.entity.instructor;
import com.example.demo.entity.student;
import com.example.demo.service.InstructorService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/modify")
public class accountChangerController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private InstructorService instructorService;

    @RequestMapping(value= "/modifyStudent",method = RequestMethod.GET)
    public void modifyStudent(@RequestParam("stu_id") String stu_id,
                              @RequestParam("stu_name") String stu_name,
                              @RequestParam("stu_department") String stu_department){
        studentService.modifyStudentByid(new student(stu_id,stu_name,stu_department));
     //   return "success";
    }


    @RequestMapping(value ="/modifyInstructor",method = RequestMethod.GET)
    public void modifyInstructor(@RequestParam("in_id") String in_id,
                                 @RequestParam("in_name") String in_name,
                                 @RequestParam("in_department") String in_department,
                                 @RequestParam("in_course") String in_course) {


        //修改完账户信息后，分数将自动清零
        int in_score = 0;
        instructor thisinstructor = new instructor(in_id,in_name,in_score,in_department,in_course);
        instructorService.modifyInstructorByid(thisinstructor);
    }

    @RequestMapping(value ="/deleteStudent",method = RequestMethod.GET)
    public void deleteStudent(@RequestParam("stu_id") String stu_id){
        studentService.deleteStudentByid(stu_id);
    }

    @RequestMapping(value ="/deleteInstructor",method = RequestMethod.GET)
    public void deleteInstructor(@RequestParam("in_id") String in_id){
    instructorService.deleteInstructorByid(in_id);
    }


}
