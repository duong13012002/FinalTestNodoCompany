package com.nodo.final_test.service;

import com.nodo.final_test.entity.MenuQuyen;

import java.util.List;

public interface QuyenMnService {
    public List<MenuQuyen> getAll();
    public MenuQuyen save(MenuQuyen menuQuyen);
    public void delete(MenuQuyen menuQuyen);
    public MenuQuyen update(MenuQuyen menuQuyen);

    public List<MenuQuyen> findByQuyenId(int id);

}
