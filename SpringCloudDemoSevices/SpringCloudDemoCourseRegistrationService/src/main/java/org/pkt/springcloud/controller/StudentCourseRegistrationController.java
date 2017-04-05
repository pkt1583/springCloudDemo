package org.pkt.springcloud.controller;

import org.pkt.springcloud.domain.Course;
import org.pkt.springcloud.service.CourseRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/courseRegistration")
public class StudentCourseRegistrationController {

    @Autowired
    private CourseRegistrationService courseRegistrationService;

    @RequestMapping(method = RequestMethod.GET, path = "getAllCourses", produces = "text/json")
    public @ResponseBody
    List<Course> showCourse() {
        return courseRegistrationService.getAllCourses();
    }

    @RequestMapping(method = RequestMethod.GET, path = "getCourse/{courseId}", produces = "text/json")
    public @ResponseBody
    List<Course> showCourse(@RequestParam(name = "courseId") Integer courseId) {
        List<Course> courses = new ArrayList<>();
        courses.add(courseRegistrationService.getCourse(courseId));
        return courses;
    }

    @RequestMapping(method = RequestMethod.POST, path = "setupdata")
    public @ResponseBody
    boolean setUpData() {
        for (int i = 0; i < 5; i++) {
            Course course = new Course();
            course.setCourseName("Course_" + i);
            courseRegistrationService.saveCourse(course);
        }
        return true;
    }

    @RequestMapping(method = RequestMethod.POST, path = "addStudentToCourse/{studentId}/{courseId}")
    public @ResponseBody
    boolean addStudentToCourse(@PathVariable(name = "studentId") Integer studentId, @PathVariable(name = "courseId") Integer courseId) {
        return courseRegistrationService.addStudentToCourse(studentId, courseId);
    }

}
