package org.pkt.springcloud.domain;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer studentId;

    @Basic
    private String studentName;

    @ManyToOne
    private Course course;

    private String test="new Test";


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
