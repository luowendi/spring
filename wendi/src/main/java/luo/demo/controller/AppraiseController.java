package luo.demo.controller;


import luo.demo.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import luo.demo.pojo.appraise;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/appraisecontroller")
public class AppraiseController {

    @Autowired
    private AppraiseService appraiseService;

    @RequestMapping(value = "/appraisedemo",method = RequestMethod.GET)
    public ModelAndView String()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sendComment");
        return modelAndView;

    }

    //http://localhost:8081/secondhourses/appraisecontroller/getappraiseById?hourseid=1
    @RequestMapping(value = "getappraiseById",method = RequestMethod.GET)
    public List<appraise> getappraiseById(@RequestParam("hourseid") int hourseid){

        List<appraise> houseappraise =  appraiseService.findAppraise(hourseid);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("message");
//        modelAndView.addObject("houseappraise",houseappraise);

        return houseappraise;
    }


    @RequestMapping(value = "/addappraise",method = RequestMethod.GET)
    public void addappraise(@RequestParam("appraisecontent") String appraisecotent,@RequestParam("userid") int userid ,@RequestParam("hourseid") int hourseid){
        System.out.println(hourseid);
        appraiseService.addAppraise(new appraise(0,appraisecotent,userid,hourseid,(new SimpleDateFormat().format(new Date())).toString()));
    }

}
