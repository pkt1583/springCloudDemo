package org.pkt.springcloud.service;

import org.pkt.springcloud.domain.Course;
import org.pkt.springcloud.domain.CourseInstructor;
import org.pkt.springcloud.domain.Student;
import org.pkt.springcloud.repository.CourseInstructorRepository;
import org.pkt.springcloud.repository.CourseRepository;
import org.pkt.springcloud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseInstructorRepository courseInstructorRepository;

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public List<CourseInstructor> getAllCourseInstructors() {
        return courseInstructorRepository.findAll();
    }

   /* public <T> List<T> getAllRecords(T ofWhat){
        if(ofWhat.getClass().equals(CourseInstructor.class)){
            return (List<T>) courseInstructorRepository.findAll();
        }else if(ofWhat.getClass().equals(Course.class)){
            return (List<T>) courseRepository.findAll();
        }else if(ofWhat.getClass().equals(Student.class)){
            return (List<T>) studentRepository.findAll();
        }
        throw new RuntimeException("Unknown type passed");
    }*/
}
