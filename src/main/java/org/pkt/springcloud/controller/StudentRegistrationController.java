package org.pkt.springcloud.controller;

import org.pkt.springcloud.domain.Course;
import org.pkt.springcloud.domain.Student;
import org.pkt.springcloud.service.InformationService;
import org.pkt.springcloud.service.PersistService;
import org.pkt.springcloud.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/studentRegistration")
public class StudentRegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private InformationService informationService;

    @Autowired
    private PersistService persistService;

    @RequestMapping(method = RequestMethod.GET,path= "showcourse",produces = "text/json")
    public @ResponseBody List<Course> showCourse(@RequestParam(name = "courseId",required = false)Integer courseId) {
        if(courseId==null) {
            return informationService.getAllCourse();
        }else {
            List<Course> courses=new ArrayList<>();
            courses.add(registrationService.getCourse(courseId));
            return courses;
        }
    }

    @RequestMapping(method = RequestMethod.POST,path = "setupdata")
    public void setUpData(){
        for(int i=0;i<5;i++) {
            Course course = new Course();
            course.setCourseName("Course_" + UUID.randomUUID());
            persistService.saveCourse(course);
        }
    }

}
