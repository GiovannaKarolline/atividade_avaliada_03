package exercicio3_notificacoes;

public class NotificacaoEmail extends Notificacao{
	String email;
	
	public NotificacaoEmail(String destinatario, String email) {
		super(destinatario);
		this.email = email;
	}

	@Override
	public void enviar(String mensagem) {
		System.out.printf("\nEnviando Email para %s - Mensagem:\n%s", this.destinatario, mensagem);
	}
	
	@Override
	public String getDestinatario() {
		// TODO Auto-generated method stub
		return super.getDestinatario();
	}

	@Override
	public void setDestinatario(String destinatario) {
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
