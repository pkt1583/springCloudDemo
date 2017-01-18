package org.pkt.springcloud.service;

import org.pkt.springcloud.domain.Student;
import org.pkt.springcloud.repository.CourseRepository;
import org.pkt.springcloud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoService {
    @Resource
    private CourseRepository courseRepository;

    @Resource
    private StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
}
