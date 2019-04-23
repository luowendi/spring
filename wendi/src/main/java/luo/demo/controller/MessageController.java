package luo.demo.controller;

import luo.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import luo.demo.pojo.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/messagecontroller")
public class MessageController {

    @Autowired
    private MessageService messageService;


    //http://localhost:8081/secondhourses/messagecontroller/getreceiveMessage?u_id=2
    @RequestMapping(value="/getreceiveMessage",method = RequestMethod.GET)
    public  List<message> getMessage(@RequestParam("u_id") int u_id){
         List<message> receivermessage = messageService.getrecivermessage(u_id);
        System.out.println("qwerqwer");
        System.out.println(receivermessage);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("receiveNotice");
//        modelAndView.addObject("receivermessage",receivermessage);

         return receivermessage;
    }

    //http://localhost:8081/secondhourses/messagecontroller/getsenderMessage?h_userseid=2
    @RequestMapping(value = "/getsenderMessage",method = RequestMethod.GET)
    public  List<message> getsenderMessage(@RequestParam("u_id") int h_userseid){
        List<message>  sendermessage = messageService.getsendermessage(h_userseid);
        System.out.println(sendermessage);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("senderNotice");
//        modelAndView.addObject("sendermessage",sendermessage);
        return sendermessage;
    }


    //htt
    @RequestMapping(value = "/sendmessage",method = RequestMethod.GET)
    public void sendMessage(@RequestParam("senderid") int senderid , @RequestParam("content")String content ,@RequestParam("recieverid") int recieverid,@RequestParam("isprivate") int i){

        if(i==1){
            System.out.println(i);
            message m = new message(0,senderid,content,recieverid,new SimpleDateFormat().format(new Date()),i);
        messageService.sendMessage(m);
        }
        else {
            System.out.println(i);
            message m = new message(0,senderid,content,-1,new SimpleDateFormat().format(new Date()),i);
            messageService.sendMessage(m);
        }
    }



    @RequestMapping(value = "deleteMessage/{id}",method = RequestMethod.GET)

    public void deleteMessage(@PathVariable("id") int id){
        messageService.deleteMessage(id);
    }

    @RequestMapping(value = "getallmessage",method = RequestMethod.GET)
    public List<message> getallMessage(){
        return  messageService.getallMessage();
    }




}
