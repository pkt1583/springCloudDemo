package org.pkt.springcloud.repository;

import org.pkt.springcloud.domain.CourseInstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseInstructorRepository extends JpaRepository<CourseInstructor,Integer> {
}
