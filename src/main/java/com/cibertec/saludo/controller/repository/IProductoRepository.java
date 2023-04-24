package com.cibertec.saludo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.saludo.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, String> {

}
