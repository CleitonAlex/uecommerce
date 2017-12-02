package br.com.uecommerce.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

	public static Connection getConnection() {

		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/uecommerce", "postgres", "84424671");
			System.out.println("conectado com sucesso");
		} catch (SQLException e) {
			System.out.println("Erro -conexão" + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("erro-driver"+e.getMessage());
		}

		return con;
	}

}
