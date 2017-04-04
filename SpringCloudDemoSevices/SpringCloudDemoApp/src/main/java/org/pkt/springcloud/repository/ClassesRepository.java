package org.pkt.springcloud.repository;

import org.pkt.springcloud.domain.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes,Integer> {
}
