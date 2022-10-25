package com.nodo.final_test.service;

import com.nodo.final_test.entity.Right;

import java.util.List;

public interface RightService {

    public List<Right> getAll();
    public Right findById(int id);
    public Right save(Right right);
    public void deleteById(int id);
    public Right update(Right right);

}
