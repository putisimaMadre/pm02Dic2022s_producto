package com.formatoweb.producto.repository;

import com.formatoweb.producto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Serializable>{}
