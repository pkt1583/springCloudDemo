package org.pkt.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.GET;

@RestController
@RequestMapping("/studentRegistration")
public class StudentRegistrationController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/allCourse")
    public String getAllCourse(){
       // restTemplate.exchange("http://courseStudentRegistration/courseRegistration/getAllCourses", GET,String.clasas)
        return "ONE";
    }

}
