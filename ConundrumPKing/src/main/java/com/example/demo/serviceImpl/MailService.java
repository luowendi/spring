package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class MailService {


    //发送方的账号
    @Value("${spring.mail.username}")
    private String from ;

    @Autowired
    private JavaMailSender mailSender;

    /**
     * 发送文本文件
     * @param to 发给谁
     * @param subject  什么主题
     * @param content  发送的正文
     */
    public void sendSimpleMail(String to,String subject,String content)
    {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        message.setFrom(from);
        mailSender.send(message);
    }

    /**
     * 发送HTML标签文件
     * @param to  发给谁
     * @param subject 发送的主题
     * @param content 发送的内容
     * @throws MessagingException
     */
    public void sendHtmlMail(String to,String subject,String content) throws MessagingException
    {
        System.out.println("已经进入到邮件里面了！");
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content,true);
        mailSender.send(message);

    }

    /**
     * 发送带有附件的邮件
     * @param to 发送的对象
     * @param subject 发送的主题
     * @param content 发送的内容
     * @param filepath  文本文件的本地路径
     * @throws MessagingException
     */
      public void sendAttachmentsMail(String to,String subject,String content,String filepath) throws MessagingException
      {
          MimeMessage message =  mailSender.createMimeMessage();
          MimeMessageHelper helper = new MimeMessageHelper(message,true);
          helper.setFrom(from);
          helper.setTo(to);
          helper.setSubject(subject);
          helper.setText(content,true);

          FileSystemResource file = new FileSystemResource(new File(filepath));
          String filename = file.getFilename();
          helper.addAttachment(filename,file);
          mailSender.send(message);
      }


}
