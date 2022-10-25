package com.nodo.final_test.service;

import com.nodo.final_test.entity.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> findAll();
    Menu findById(int id);
    void save(Menu menu);
    void deleteById(int id);

}
