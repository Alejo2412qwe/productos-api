/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.mongo.controller;

import com.m5a.mongo.model.Product;
import com.m5a.mongo.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LaptopSA
 */
@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
public class ProductoController {

    @Autowired
    private ProductoRepository repository;

    @PostMapping("/productos")
    public Product create(@Validated @RequestBody Product p) {
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Product> readAll() {
        return repository.findAll();
    }

    @PutMapping("/productos/{id}")
    public Product update(@PathVariable String id, @Validated @RequestBody Product p) {
        p.setName(p.getName());
        p.setPrice(p.getPrice());
        p.setId(p.getId());
        p.setExpiry_date(p.getExpiry_date());
        return repository.save(p);
    }

    @DeleteMapping("/productos/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}
