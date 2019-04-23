package luo.demo.controller;


import luo.demo.service.HourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import luo.demo.pojo.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/house")
public class HourseController {

    @Autowired
    private HourseService hourseService;

    @RequestMapping(value = "/getallhourses",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getallHourse(){
            List<hourse> learnList =hourseService.getallHourse();
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("houselist");
            modelAndView.addObject("learnList", learnList);
            return modelAndView;
        }


    @RequestMapping("/deletehourse/{id}")
    public ModelAndView deletehourse(@PathVariable("id") int id){
        hourseService.deletehourse(id);
        List<hourse> learnList =hourseService.getallHourse();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("houselist");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;

    }

    @RequestMapping("/inserthourse")
    public void insertHourse(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("introduce") String introdice,@RequestParam("price") double price ,@RequestParam("userid") int userid){
        hourseService.insertHourse(new hourse(0,name,address,introdice,price,userid,userid,(new SimpleDateFormat().format(new Date())).toString()));
    }

    @RequestMapping("/updatehourse")
    public void updateHourse(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("introduce") String introdice,@RequestParam("price") double price ,@RequestParam("userid") int userid){
        hourseService.updateHourse(new hourse(0,name,address,introdice,price,userid,userid,(new SimpleDateFormat().format(new Date())).toString()));
    }

}
