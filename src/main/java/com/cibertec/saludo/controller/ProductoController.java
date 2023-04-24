package com.cibertec.saludo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.saludo.controller.repository.IProductoRepository;
import com.cibertec.saludo.model.Producto;

@Controller
public class ProductoController {
	@Autowired
	private IProductoRepository repo;
	
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("producto", new Producto());
		return "crudproductos";
	}
	
	
	
	@PostMapping("/guardar")
	public String grabarPag(@ModelAttribute Producto producto) {
		repo.save(producto);
		return "registrado";
	}
}
