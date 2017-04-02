package org.pkt.springcloud.service;

import org.pkt.springcloud.domain.CourseInstructor;
import org.pkt.springcloud.domain.Course;
import org.pkt.springcloud.domain.Student;
import org.pkt.springcloud.repository.CourseInstructorRepository;
import org.pkt.springcloud.repository.CourseRepository;
import org.pkt.springcloud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersistService {
    @Autowired
    private CourseInstructorRepository courseInstructorRepository;


    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    public void saveCourse(Course... courses) {
        for (Course course : courses) {
            courseRepository.save(course);
        }
    }

    public void saveStudent(Student... students) {
        for (Student student : students) {
            studentRepository.save(student);
        }
    }


    public void saveCourseInstructor(CourseInstructor... courseInstructors) {
        for (CourseInstructor courseInstructor : courseInstructors) {
            courseInstructorRepository.save(courseInstructor);
        }
    }
}
