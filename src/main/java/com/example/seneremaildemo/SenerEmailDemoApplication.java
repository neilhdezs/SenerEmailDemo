package com.example.seneremaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SenerEmailDemoApplication implements CommandLineRunner
{
    @Autowired
    private EmailService emailService;

    public static void main(String[] args)
    {
        SpringApplication.run(SenerEmailDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {

        System.out.println("Sending Email...");
        String message = "mensaje de prueba";

        emailService.sendMailWithAttachment("emailDestino@server.com", "Enviado desde JavaMailSender", message, "RutaDestino");
    }
}


