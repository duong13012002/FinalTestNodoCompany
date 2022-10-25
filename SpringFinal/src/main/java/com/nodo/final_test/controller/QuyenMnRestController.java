package com.nodo.final_test.controller;

import com.nodo.final_test.entity.MenuQuyen;
import com.nodo.final_test.service.QuyenMnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quyenmn")
@CrossOrigin(origins = "http://localhost:4200")
public class QuyenMnRestController {
    @Autowired
    private QuyenMnService quyenMnService;

    @GetMapping("/all")
    public ResponseEntity<List<MenuQuyen>> getAll(){
        return ResponseEntity.ok(quyenMnService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<MenuQuyen>> getAllByNhomQuyenId(@PathVariable("id") int id) {
        return ResponseEntity.ok(quyenMnService.findByQuyenId(id));
    }
    @PutMapping("/update")
    public ResponseEntity<MenuQuyen> update(@RequestBody MenuQuyen menuQuyen) {
        return ResponseEntity.ok(quyenMnService.update(menuQuyen));
    }
}
