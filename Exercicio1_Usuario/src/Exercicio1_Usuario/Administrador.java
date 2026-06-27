package Exercicio1_Usuario;

public class Administrador extends Usuario{
	int nivelDeAcesso;

	public Administrador(String nome, String email, int nivelDeAcesso) throws Validacao {
		super(nome, email);
		this.nivelDeAcesso = nivelDeAcesso;
	}

	public int getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(int nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nível de acesso: " + this.nivelDeAcesso);
	}
}