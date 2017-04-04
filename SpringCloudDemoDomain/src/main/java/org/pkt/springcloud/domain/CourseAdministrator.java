package org.pkt.springcloud.domain;

import java.util.List;

@Entity
public class CourseAdministrator {
    @Id
    @GeneratedValue
    private Integer courseAdministratorId;

    @Basic
    private String courseAdministratorName;

    @OneToMany
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Integer getCourseAdministratorId() {
        return courseAdministratorId;
    }

    public void setCourseAdministratorId(Integer courseAdministratorId) {
        this.courseAdministratorId = courseAdministratorId;
    }

    public String getCourseAdministratorName() {
        return courseAdministratorName;
    }

    public void setCourseAdministratorName(String courseAdministratorName) {
        this.courseAdministratorName = courseAdministratorName;
    }
}
