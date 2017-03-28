package org.pkt.springcloud.controller;

import org.pkt.springcloud.domain.Course;
import org.pkt.springcloud.domain.Student;
import org.pkt.springcloud.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/studentRegistration")
public class StudentRegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(method = RequestMethod.GET,path= "showcourse",produces = "text/json")
    public @ResponseBody List<Course> showCourse(@RequestParam(name = "courseId",required = false)Integer courseId) {
        if(courseId==null) {
            return registrationService.getAllCourses();
        }else {
            List<Course> courses=new ArrayList<>();
            courses.add(registrationService.getCourse(courseId));
            return courses;
        }
    }

}
