package com.formatoweb.producto.controller;

import com.formatoweb.producto.entity.Producto;
import com.formatoweb.producto.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {
    @Autowired
    private ProductosService productosService;

    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return productosService.getProductos();
    }

    @GetMapping("/ver/{id}")
    public Producto getProductoById(@PathVariable Long id){
        return productosService.getProductoById(id);
    }
}
