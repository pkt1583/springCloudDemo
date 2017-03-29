package org.pkt.springcloud.domain;

import javax.persistence.*;
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

    @ManyToOne
    private CourseInstructor courseInstructor;

    public CourseInstructor getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(CourseInstructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

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
