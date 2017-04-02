package org.pkt.service;

import org.pkt.domain.CourseInstructor;
import org.pkt.domain.Course;
import org.pkt.domain.Student;
import org.pkt.repository.CourseInstructorRepository;
import org.pkt.repository.CourseRepository;
import org.pkt.repository.StudentRepository;
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
