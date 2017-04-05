package org.pkt.springcloud.controller;

import org.pkt.springcloud.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.List;

import static org.springframework.http.HttpMethod.GET;

@RestController
@RequestMapping("/studentRegistration")
public class StudentRegistrationController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/allCourse")
    public String getAllCourse(){
       ResponseEntity responseEntity= restTemplate.exchange("http://cousestudentregistration/courseRegistration/getAllCourses", GET, null, new ParameterizedTypeReference<List< Course>>() {
        });
        Object body=responseEntity.getBody();
        return "ONE";
    }

}
