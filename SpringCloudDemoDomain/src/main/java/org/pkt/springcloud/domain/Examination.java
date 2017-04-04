package org.pkt.springcloud.domain;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Examination {
    @Id @GeneratedValue
    private Integer examinationId;

    @Basic
    private String examinationName;


    @ManyToMany
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public String getExaminationName() {
        return examinationName;
    }

    public void setExaminationName(String examinationName) {
        this.examinationName = examinationName;
    }

}
