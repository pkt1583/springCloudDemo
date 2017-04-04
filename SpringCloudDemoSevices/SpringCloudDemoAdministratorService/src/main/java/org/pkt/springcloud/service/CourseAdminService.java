package org.pkt.springcloud.service;

import org.pkt.springcloud.domain.CourseAdministrator;
import org.pkt.springcloud.repository.CourseAdministratorRepository;
import org.pkt.springcloud.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseAdminService {

    @Autowired
    private CourseAdministratorRepository courseAdministratorRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseAdministrator> getAllCourseAdministrator() {
        return courseAdministratorRepository.findAll();
    }

    public void addCourseToCourseAdministrator(Integer courseId, Integer administratorId) {
        CourseAdministrator courseAdministrator = courseAdministratorRepository.findOne(administratorId);
        courseAdministrator.getCourses().add(courseRepository.getOne(courseId));
    }

    public CourseAdministrator getCourseAdministratorByCourse(Integer courseId) {
        List<CourseAdministrator> courseAdministrators = getAllCourseAdministrator();
        Optional<CourseAdministrator> courseAdmin = courseAdministrators.stream().filter(courseAdministrator -> {
            long count = courseAdministrator.getCourses().stream().filter(course -> course.getCourseId().equals(courseId)).count();
            if (count == 0) {
                return false;
            } else {
                return true;
            }
        }).findFirst();
        return courseAdmin.get();
    }

    public void save(CourseAdministrator courseAdministrator) {
        courseAdministratorRepository.save(courseAdministrator);
    }
}
