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
	@WebMethod
	public Boolean addProduct(Product product) {
		return productService.addProduct(product);
	}

	@Override
	public Boolean updProduct(Product product) {
		return productService.updProduct(product);
	}

	@Override
	public Boolean delProduct(Product product) {
		return productService.del(product);
	}

	@Override
	@WebMethod
	public List<Product> getAllProducts() {
		return productService.getAll();
	}

}
