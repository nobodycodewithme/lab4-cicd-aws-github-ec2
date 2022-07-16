package com.nobodycodewithme.lab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
@RequestMapping("/info")
public class Lab4Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab4Application.class, args);
    }

    @GetMapping
    public String test() throws UnknownHostException {
        return String.format("<h4>NoBodyCodeWithMe cicd github, aws codebuild, codepipeline, ecr, ecs ec2, route 53, autoscaling</h4> " +
                "<br> " +
                "<br> " +
                "<h4>Host name: %s</>", InetAddress.getLocalHost().getHostName());
    }

}
