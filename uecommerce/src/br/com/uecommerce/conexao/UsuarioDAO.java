package br.com.uecommerce.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.uecommerce.bens.Usuario;

public class UsuarioDAO {
	Connection con = conexao.getConnection();
	
	public void cadastro(Usuario usuario){
		String sql ="INSERT INTO usuario (nome, email,senha) values(?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getEmail());
			preparador.setString(3, usuario.getSenha());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("cadastro efetuado com sucesso");
			
		} catch (SQLException e) {
			System.out.println("erro"+e.getMessage());
		}
		
	}

}
