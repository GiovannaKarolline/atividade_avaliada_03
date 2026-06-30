package exercicio3_notificacoes;

public class NotificacaoSMS extends Notificacao{
	
	public NotificacaoSMS(String destinatario) {
		super(destinatario);
	}
	
	@Override
	public void enviar(String mensagem) {
		String destinatario = this.destinatario.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
		System.out.printf("\nEnviando SMS para %s - Mensagem: %s", destinatario, mensagem);
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
