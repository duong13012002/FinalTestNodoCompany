package com.nodo.final_test.repository;

import com.nodo.final_test.entity.Right;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RightRepository extends JpaRepository<Right, Integer> {

}
