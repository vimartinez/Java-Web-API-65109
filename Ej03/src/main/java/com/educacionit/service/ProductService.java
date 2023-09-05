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
	
	

}
