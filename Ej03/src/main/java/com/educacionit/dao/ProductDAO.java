package com.educacionit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.educacionit.model.Product;

public class ProductDAO implements DAO<Product, Long>, MySQLConnection {
	
	private String getAllProducts = "SELECT id, nombre, descripcion, precio FROM Product;";
	private String getProductById = "SELECT id, nombre, descripcion, precio FROM Product WHERE id = ?";
	
	private PreparedStatement psQuery;

	@Override
	public List<Product> getAll() {
		List<Product> listadoDeProductos = new ArrayList<Product>();
		System.out.println("getAllProducts");
		try {
			psQuery = conectarDB().prepareStatement(getAllProducts);
			ResultSet resultado = psQuery.executeQuery();
			while(resultado.next()) {
				Product productAux = new Product();
				productAux.setId(resultado.getLong("id"));
				productAux.setNombre(resultado.getString("nombre"));
				productAux.setDescripcion(resultado.getString("descripcion"));
				productAux.setPrecio(resultado.getFloat("precio"));
				listadoDeProductos.add(productAux);
				System.out.println(productAux.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listadoDeProductos;
	}

	@Override
	public Boolean add(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean upd(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean del(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(Long id) {
		Product productAux = null;
		try {
			psQuery = conectarDB().prepareStatement(getProductById);
			psQuery.setLong(1, id);
			ResultSet resultado = psQuery.executeQuery();
			if(resultado.next()) {
				productAux = new Product();
				productAux.setId(resultado.getLong("id"));
				productAux.setNombre(resultado.getString("nombre"));
				productAux.setDescripcion(resultado.getString("descripcion"));
				productAux.setPrecio(resultado.getFloat("precio"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productAux;
	}



}
