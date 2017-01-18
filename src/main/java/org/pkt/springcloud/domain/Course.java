package org.pkt.springcloud.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {
    @Id
    private Integer courseId;

    @Basic
    private String courseName;

    @OneToMany(mappedBy = "course")
    private Set<Student> courseStudents = new HashSet<>();

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(Set<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }
}
