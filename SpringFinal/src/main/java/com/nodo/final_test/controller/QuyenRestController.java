package com.nodo.final_test.controller;

import com.nodo.final_test.entity.Quyen;
import com.nodo.final_test.service.QuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quyen")
@CrossOrigin(origins = "http://localhost:4200")
public class QuyenRestController {
    @Autowired
    private QuyenService quyenService;

    @GetMapping("/all")
    public ResponseEntity<List<Quyen>> getAll(){
        return ResponseEntity.ok(quyenService.getAll());
    }
}
