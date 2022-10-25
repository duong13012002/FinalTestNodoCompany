package com.nodo.final_test.service;

import com.nodo.final_test.entity.Quyen;

import java.util.List;

public interface QuyenService {

    public List<Quyen> getAll();
    public Quyen findById(int id);
    public Quyen save(Quyen quyen);
    public void deleteById(int id);
    public Quyen update(Quyen quyen);
}
