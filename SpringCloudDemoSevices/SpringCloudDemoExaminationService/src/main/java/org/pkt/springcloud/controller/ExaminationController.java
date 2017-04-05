package org.pkt.springcloud.controller;

import org.pkt.springcloud.domain.Course;
import org.pkt.springcloud.domain.Examination;
import org.pkt.springcloud.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/examination")
public class ExaminationController {

    @Autowired
    private ExaminationService examinationService;

    @RequestMapping(method = GET,path = "getallexams",produces = "text/json")
    public @ResponseBody List<Examination> getAllExaminations(){
        return examinationService.getAllExaminations();
    }

    @RequestMapping(method = POST,path = "addStudentsToExam/{studentId}/{examId}")
    public @ResponseBody boolean addStudent(@PathVariable(name = "studentId")Integer studentId,@PathVariable(name = "examId") Integer examId){
        return examinationService.addStudentToExamination(examId,studentId);
    }
}
