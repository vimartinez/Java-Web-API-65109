package com.educacionit.service;

import java.util.List;

import com.educacionit.dao.ProductDAO;
import com.educacionit.model.Product;

public class ProductService {
	
	ProductDAO productDAO = new ProductDAO();

	public List<Product> getAll() {
		return productDAO.getAll();
	}

	public Product getById(Long productId) {
		return productDAO.getById(productId);
	}

	public Boolean addProduct(Product product) {
		return productDAO.add(product);
	}

	public Boolean del(Product product) {
		return productDAO.del(product);
	}

	public Boolean updProduct(Product product) {
		
		
		//1 ver si el producto existe, getById
		// si el producto existe verificar que atributos vienen en el objeto
		//reemplazar solo aquellos que vengan, cuando no hay ninguno dejar el original
		
		return productDAO.upd(product);
	}
	
	

}
