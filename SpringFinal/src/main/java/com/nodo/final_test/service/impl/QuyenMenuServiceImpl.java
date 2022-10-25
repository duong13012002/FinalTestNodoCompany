package com.nodo.final_test.service.impl;

import com.nodo.final_test.entity.MenuQuyen;
import com.nodo.final_test.repository.QuyenMnRepository;
import com.nodo.final_test.service.QuyenMnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuyenMenuServiceImpl implements QuyenMnService {

    @Autowired
    private QuyenMnRepository quyenMnRepository;

    @Override
    public List<MenuQuyen> getAll() {
        return quyenMnRepository.findAll();
    }

    @Override
    public MenuQuyen save(MenuQuyen menuQuyen) {
        return quyenMnRepository.save(menuQuyen);
    }

    @Override
    public void delete(MenuQuyen menuQuyen) {
        quyenMnRepository.delete(menuQuyen);
    }

    @Override
    public MenuQuyen update(MenuQuyen menuQuyen) {
        return quyenMnRepository.save(menuQuyen);
    }

    @Override
    public List<MenuQuyen> findByQuyenId(int id) {
        return quyenMnRepository.findByQuyenId(id);
    }


}
