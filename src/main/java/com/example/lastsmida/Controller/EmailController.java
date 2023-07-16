//package com.example.lastsmida.Controller;
//
//import com.example.lastsmida.Model.Email;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//@RestController
//public class EmailController {
//
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    @PostMapping("/send_email")
//    public void sendEmail(@RequestBody Email email) throws MessagingException{
//        MimeMessage message = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message);
//        helper.setTo(email.getTo());
//        helper.setSubject(email.getSubject());
//        helper.setText(email.getBody(), true);
//        javaMailSender.send(message);
//
//    }
//
//
////
////    @PostMapping("/send-email")
////    public void sendEmail(@RequestBody EmailEntity emailEntity) throws MessagingException {
////        MimeMessage message = javaMailSender.createMimeMessage();
////        MimeMessageHelper helper = new MimeMessageHelper(message);
////        helper.setTo(emailEntity.getTo());
////        helper.setSubject(emailEntity.getSubject());
////        helper.setText(emailEntity.getBody(), true);
////        javaMailSender.send(message);
//
//
//}
