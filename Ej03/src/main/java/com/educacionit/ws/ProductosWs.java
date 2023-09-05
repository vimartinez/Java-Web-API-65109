package com.educacionit.ws;

import java.util.List;

import com.educacionit.model.Product;

public interface ProductosWs {
	
	public Product getProductById(Long productId);
	
	public Boolean addProduct(Product product);
	
	public Boolean updProduct(Product product);
	
	public Boolean delProduct(Product product);
	
	public List<Product> getAllProducts();

}
