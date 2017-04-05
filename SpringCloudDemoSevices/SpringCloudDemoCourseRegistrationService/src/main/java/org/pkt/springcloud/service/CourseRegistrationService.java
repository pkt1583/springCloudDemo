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
public class CourseRegistrationService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;


    public Course getCourseByStudent(Integer studentId) {
        return studentRepository.getOne(studentId).getCourse();
    }

    public Set<Student> getStudentsByCourse(Integer courseId) {
        return courseRepository.findOne(courseId).getCourseStudents();
    }

    public Course getCourse(Integer courseId) {
        return courseRepository.getOne(courseId);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public boolean addStudentToCourse(Integer studentId, Integer courseId) {
        Course course = courseRepository.findOne(courseId);
        Student student = studentRepository.findOne(studentId);
        course.getCourseStudents().add(student);
        courseRepository.save(course);
        return true;
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }
}
