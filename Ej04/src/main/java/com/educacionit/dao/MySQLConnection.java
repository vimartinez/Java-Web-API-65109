package com.educacionit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface MySQLConnection {
	
	default Connection conectarDB() {
		
		Connection conexion = null;
		String url = "jdbc:mysql://localhost:3306/jwa-04";
		String usr = "root";
		String pass = "1234";
		
		try {
			conexion = DriverManager.getConnection(url, usr, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conexion;
		
	}

}
