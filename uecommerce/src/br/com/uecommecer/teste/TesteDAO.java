package br.com.uecommecer.teste;

import br.com.uecommerce.bens.Usuario;
import br.com.uecommerce.conexao.UsuarioDAO;

public class TesteDAO {

	public static void main(String[] args) {
		testeCadastro();

	}
	
	public static void testeCadastro(){
		Usuario usu = new Usuario();
		usu.setNome("cleiton");
		usu.setEmail("Teste@gmail.com");
		usu.setSenha("123456789");
		
		UsuarioDAO usudao = new UsuarioDAO();
		usudao.cadastro(usu);
	}

}
