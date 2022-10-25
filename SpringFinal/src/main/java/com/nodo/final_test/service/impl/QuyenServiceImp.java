package com.nodo.final_test.service.impl;

import com.nodo.final_test.entity.Quyen;
import com.nodo.final_test.repository.QuyenRepository;
import com.nodo.final_test.service.QuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QuyenServiceImp implements QuyenService {

    @Autowired
    private QuyenRepository quyenRepository;

    @Override
    public List<Quyen> getAll() {
        return quyenRepository.findAll();
    }

    @Override
    public Quyen findById(int id) {
        return quyenRepository.findById(id).get();
    }

    @Override
    public Quyen save(Quyen quyen) {
        return quyenRepository.save(quyen);
    }

    @Override
    public void deleteById(int id) {
        quyenRepository.deleteById(id);
    }

    @Override
    public Quyen update(Quyen quyen) {
        return quyenRepository.save(quyen);
    }


}
