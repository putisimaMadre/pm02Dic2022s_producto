package com.formatoweb.producto.service.imp;

import com.formatoweb.producto.entity.Producto;
import com.formatoweb.producto.repository.ProductoRepository;
import com.formatoweb.producto.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService {
    @Autowired
    private ProductoRepository productosRepository;
    @Override
    public List<Producto> getProductos() {
        return productosRepository.findAll();
    }

    @Override
    public Producto getProductoById(Long id) {
        return productosRepository.findById(id).orElse(null);
    }
}
