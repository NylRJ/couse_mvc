package com.i9Developd.couse_mv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoController {
	
	@RequestMapping("/cadastrarProduto")
	public String form() {
		
		return "product/formProduct";
		
	}

}
