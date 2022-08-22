package com.example.demoemailwithtemplate.controller;

import com.example.demoemailwithtemplate.entity.Email;
import com.example.demoemailwithtemplate.service.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequiredArgsConstructor
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @PostMapping("/email/send/html")
    public void sendHtmlMessage(@RequestBody Email email) throws MessagingException {
        emailSenderService.sendHtmlMessage(email);
    }

    @PostMapping("email/send")
    public void sendSimpleMessage(@RequestBody Email email) {
        emailSenderService.sendSimpleMessage(email);
    }

    @PostMapping("email/sendAtt")
    public void sendMessageWithAttachment(@RequestBody Email email) {
        emailSenderService.sendMailWithAttachment(email);
    }
}