package org.pkt.springcloud.controller;

import org.pkt.springcloud.domain.CourseAdministrator;
import org.pkt.springcloud.service.CourseAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/courseAdministrator")
public class CourseAdministratorController {

    @Autowired
    private CourseAdminService courseAdminService;


    @RequestMapping(method = RequestMethod.GET, path = "getAllCourseAdministrator", produces = "text/json")
    public @ResponseBody
    List<CourseAdministrator> getAllCourseAdoministrator() {
        return courseAdminService.getAllCourseAdministrator();
    }

    @RequestMapping(method = RequestMethod.POST, path = "addCourseToCourseAdministrator/{courseId}/{administratorId}", produces = "text/json")
    public @ResponseBody
    boolean showCourse(@PathVariable(name = "courseId") Integer courseId, @PathVariable(name = "administratorId") Integer administratorId) {
        courseAdminService.addCourseToCourseAdministrator(courseId, administratorId);
        return true;
    }

    @RequestMapping(method = RequestMethod.POST, path = "setupdata")
    public @ResponseBody
    boolean setUpData() {
        for (int i = 0; i < 5; i++) {
            CourseAdministrator courseAdministrator = new CourseAdministrator();
            courseAdministrator.setCourseAdministratorName("courseAdministrator_" + i);
            courseAdminService.save(courseAdministrator);
        }
        return true;
    }

}
