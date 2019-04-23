package luo.demo.controller;

import luo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import luo.demo.pojo.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/getallusers",method = RequestMethod.GET)
    public  ModelAndView getallusers(){

        List<users> learnList =userService.getallUsers();
        if(learnList ==null)
        {
            System.out.println("未查询到数据");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userlist");
        modelAndView.addObject("usersList", learnList);
        return modelAndView;
    }

    @RequestMapping(value = "/userAdd",method = RequestMethod.GET)
    public ModelAndView userAdd(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userAdd");
        return  modelAndView;
    }

    @RequestMapping(value = "/userEdit",method = RequestMethod.GET)
    public ModelAndView userEdit(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userEdit");
        return  modelAndView;
    }


    @RequestMapping(value = "login",method = RequestMethod.GET)
    public users login(@RequestParam(value = "username") String username , @RequestParam(value = "password")String password){
        users users = userService.loginUser(username,password);
        return users;
    }

    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public void insert(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("telephone")String telephone,@RequestParam("sex") String sex){
        users users = new users(0,username,password,telephone,sex,(new SimpleDateFormat().format(new Date())).toString());
        userService.insertUser(users);
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public void updateUser(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("telephone")String telephone,@RequestParam("sex") String sex){
        users users = new users(0,username,password,telephone,sex,(new SimpleDateFormat().format(new Date())).toString());
        userService.insertUser(users);
    }


}
