package org.pkt.service;

import org.pkt.domain.Course;
import org.pkt.domain.Student;
import org.pkt.repository.CourseRepository;
import org.pkt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RegistrationService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;


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
