package com.SolucionesT2.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	@RequestMapping("/")
	public String inicio(Model model) {
		return "producto/index";
	}

}
