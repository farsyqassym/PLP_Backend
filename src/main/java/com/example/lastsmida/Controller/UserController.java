package com.example.lastsmida.Controller;

//import com.example.lastsmida.Model.Email;
import com.example.lastsmida.Model.Staff;
import com.example.lastsmida.Model.Applicant;
import com.example.lastsmida.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JavaMailSender mailSender;

    @PostConstruct
    public void initRoleAndUsers() {
        userService.initRoleAndUser();
    }

    @PostMapping("/registerNewApplicant")
    public Applicant registerNewUser(@RequestBody Applicant applicant){
        return userService.registerNewApplicant(applicant);
    }

    //register staff ******************************************
    @PostMapping("/registerNewStaff")
    public Staff registerNewStaffs(@RequestBody Staff staff) throws MessagingException, UnsupportedEncodingException {
//        send(staff.getUserEmail());
        return userService.registerNewStaff(staff);

    }


    @PostMapping("/send_email")
    public String send(@RequestBody String email) throws MessagingException, UnsupportedEncodingException {
        String from = "KASSIM";
        String sender = "Kassim Notification";
        String subject = "Your Account Is created";
        String content = "Mambo vipi ? Haya Tuendelee Kutumiana";


            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setFrom(from, sender);
            
            helper.setTo(email);
            helper.setSubject(subject);

            helper.setText(content, true);
            mailSender.send(message);
            System.out.println("sent");

        return "Mail sent";
    }


}


