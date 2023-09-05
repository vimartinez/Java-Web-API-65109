package com.educacionit.ws;

import java.util.List;

import com.educacionit.model.Product;
import com.educacionit.service.ProductService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class ProductosWsImpl implements ProductosWs {
	
	ProductService productService = new ProductService();

	@Override
	@WebMethod
	public Product getProductById(@WebParam(name="ProductoID") Long productId) {
		return productService.getById(productId);
	}

	@Override
	public Boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	public List<Product> getAllProducts() {
		return productService.getAll();
	}

}
