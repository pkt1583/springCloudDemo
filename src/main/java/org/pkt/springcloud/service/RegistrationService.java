package org.pkt.springcloud.service;

import org.pkt.springcloud.domain.Course;
import org.pkt.springcloud.domain.Student;
import org.pkt.springcloud.repository.CourseRepository;
import org.pkt.springcloud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RegistrationService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseByStudent(Integer studentId){
        return studentRepository.getOne(studentId).getCourse();
    }

    public Set<Student> getStudentsByCourse(Integer courseId){
        return courseRepository.findOne(courseId).getCourseStudents();
    }

    public Course getCourse(Integer courseId) {
        return courseRepository.getOne(courseId);
    }
}
