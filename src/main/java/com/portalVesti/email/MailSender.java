/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.email;

import com.mysql.cj.Session;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import java.util.Properties;
import javax.ejb.SessionBean;
import javax.ejb.Stateless;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Kata
 */
public class MailSender {

    private String toEmail;
    private String subject;
    private String message;

    public MailSender(String toEmail, String subject, String message) {
        this.toEmail = toEmail;
        this.subject = subject;
        this.message = message;
    }

    public void sendEmail() {
        

        final String fromEmail = "portalvesti011@gmail.com";
        final String password = "portalvesti";
        
        Properties prop = new Properties();

        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        prop.put("mail.smtp.host", "smtp.gmail.com");

        javax.mail.Session session = javax.mail.Session.getDefaultInstance(prop, new Authenticator() {

            public PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(fromEmail, password);

            }
        });

        try {
            MimeMessage mailMessage = new MimeMessage(session);
            mailMessage.setFrom(new InternetAddress(fromEmail));

            mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            mailMessage.setText(message);
            mailMessage.setSubject(subject);
            
            Transport transport = session.getTransport("smtp");
            transport.send(mailMessage);

        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }

    }

}
