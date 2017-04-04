package org.pkt.springcloud.service;

import org.pkt.springcloud.domain.Examination;
import org.pkt.springcloud.domain.Student;
import org.pkt.springcloud.repository.ExaminationRepository;
import org.pkt.springcloud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExaminationService {

    @Resource(name = "examinationRepository")
    private ExaminationRepository examinationRepository;

    @Autowired
    private StudentRepository studentRepository;

    public List<Examination> getAllExaminations(){
        return examinationRepository.findAll();
    }

    public List<Student> getAllStudentsForExam(Integer examId){
        List<Student> students=examinationRepository.findOne(examId).getStudents();
        return students;
    }

    public boolean addStudentToExamination(Integer examId,Integer studentId){
        Examination examination=examinationRepository.findOne(examId);
        Student student=studentRepository.findOne(studentId);
        examination.getStudents().add(student);
        examinationRepository.saveAndFlush(examination);
        return true;
    }
}
