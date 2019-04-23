package luo.demo.controller;


import luo.demo.pojo.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class Secondpage_controller {



    @RequestMapping("/second/{id}")
      public String second(@PathVariable("id") int id, Model m){
//
//        Blog blog = new Blog();
//        blog.setAddress("黑龙江省哈尔滨市南岗区");
//        blog.setId(id);
//        blog.setName("罗文弟");
//        blog.setPrice(10000);
//        blog.setTelephonenumber("17390600822");
//
//        m.addAttribute("blog",blog);
          m.addAttribute("now",id);
          m.addAttribute("name","luowendi");
          m.addAttribute("address","哈尔滨市南岗区");
          m.addAttribute("phonenumber","17390600822");
          return "hello";
      }
}
