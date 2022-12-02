package com.formatoweb.producto.service;

import com.formatoweb.producto.entity.Producto;

import java.util.List;

public interface ProductosService {
    List<Producto> getProductos();
    Producto getProductoById(Long id);
}
