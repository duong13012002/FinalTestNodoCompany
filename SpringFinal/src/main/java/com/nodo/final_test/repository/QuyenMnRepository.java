package com.nodo.final_test.repository;

import com.nodo.final_test.entity.MenuQuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface QuyenMnRepository extends JpaRepository<MenuQuyen, Integer> {

    @Query(value = "select * from quyen_menu where quyen_id = ?1", nativeQuery = true)
    List<MenuQuyen> findByQuyenId(@PathVariable int id);
}
