package exercicio3_notificacoes;

public class NotificacaoEmail extends Notificacao{
	
	public NotificacaoEmail(String destinatario) throws Validacao {
		super(destinatario, 1);
	}

	@Override
	public void enviar(String mensagem) throws Validacao {
		Validacao.validarMensagem(mensagem);
		System.out.printf("\nEnviando Email para %s - Mensagem: %s", this.destinatario, mensagem);
	}
	
	@Override
	public String getDestinatario() {
		// TODO Auto-generated method stub
		return super.getDestinatario();
	}

	@Override
	public void setDestinatario(String destinatario) throws Validacao {
		// TODO Auto-generated method stub
		super.setDestinatario(destinatario);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}
