package org.pkt.springcloud.repository;

import org.pkt.springcloud.domain.CourseAdministrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseAdministratorRepository extends JpaRepository<CourseAdministrator, Integer> {
}
