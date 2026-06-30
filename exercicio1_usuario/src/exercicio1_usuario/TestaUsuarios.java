package exercicio1_usuario;

import java.util.ArrayList;
import java.util.List;

public class TestaUsuarios {

	public static void main(String[] args) throws Validacao {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		criarUsuarios(usuarios);
		
		for(Usuario usuario : usuarios) {
			usuario.visualizar();
		}
		
		criarUsuariosInvalidos(usuarios);
		
		for(Usuario usuario : usuarios) {
			usuario.visualizar();
		}

	}
	
	public static void criarUsuarios(List<Usuario> listaUsuarios) throws Validacao{
		try {
			Usuario usuario = new Usuario("Amara","amaraSelles@gmail.com");
			Usuario usuario2 = new Usuario("Carolina","lima.carol@gmail.com");
			Administrador adm = new Administrador("Leandro","le.andro@gmail.com", 1);
			listaUsuarios.add(usuario);
			listaUsuarios.add(usuario2);
			listaUsuarios.add(adm);
		}catch(Validacao excessao) {
			System.out.println(excessao.getMessage());
		}
	}
	
	public static void criarUsuariosInvalidos(List<Usuario> listaUsuarios) throws Validacao{
		try {
			Usuario usuario = new Usuario("","amaraSellesgmail.com");
			listaUsuarios.add(usuario);
		}catch(Validacao excessao) {
			System.out.println(excessao.getMessage());
		}
		try {
			Usuario usuario2 = new Usuario("Carolina","lima.carol@gmail.com.");
			listaUsuarios.add(usuario2);
		}catch(Validacao excessao) {
			System.out.println(excessao.getMessage());
		}
		try {
			Administrador adm = new Administrador("Leandro","le.andro@gmail", 1);
			listaUsuarios.add(adm);
		}catch(Validacao excessao) {
			System.out.println(excessao.getMessage());
		}
	}

}
