package exercicio3_notificacoes;

public class Notificacao {
	String destinatario;
	int tipo;

	public Notificacao(String destinatario, int tipo) throws Validacao {
		Validacao.validarDestinatario(destinatario, tipo);
		this.destinatario = destinatario;
		this.tipo = tipo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) throws Validacao {
		Validacao.validarDestinatario(destinatario, tipo);
		this.destinatario = destinatario;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void enviar(String mensagem) throws Validacao {
		Validacao.validarMensagem(mensagem);
		System.out.printf("\n%s", mensagem);
	}
}
