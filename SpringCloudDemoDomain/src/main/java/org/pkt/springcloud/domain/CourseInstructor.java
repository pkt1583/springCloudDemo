package org.pkt.springcloud.domain;

import java.util.List;

@Entity
public class CourseInstructor {
    @Id
    @GeneratedValue
    private Integer courseInstructorId;

    @Basic
    private String courseInstructorName;

    @OneToMany
    private List<Course> courses;

    public Integer getCourseInstructorId() {
        return courseInstructorId;
    }

    public void setCourseInstructorId(Integer courseInstructorId) {
        this.courseInstructorId = courseInstructorId;
    }

    public String getCourseInstructorName() {
        return courseInstructorName;
    }

    public void setCourseInstructorName(String courseInstructorName) {
        this.courseInstructorName = courseInstructorName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
