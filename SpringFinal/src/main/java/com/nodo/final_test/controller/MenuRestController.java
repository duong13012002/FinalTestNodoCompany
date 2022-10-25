package com.nodo.final_test.controller;

import com.nodo.final_test.entity.Menu;
import com.nodo.final_test.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuRestController {
    private MenuService menuService;

    @Autowired
    public MenuRestController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Menu>> findAll() {
        return ResponseEntity.ok(menuService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Menu> save(@RequestBody Menu menu) {
        menuService.save(menu);
        return ResponseEntity.ok(menu);
    }
}
