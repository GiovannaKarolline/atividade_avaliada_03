package exercicio3_notificacoes;

import java.util.Optional;

public class Validacao extends Exception {

	private static final long serialVersionUID = 1L;

	public Validacao() {}

	public Validacao(String mensagem) {
		super(mensagem);
	}

	public static void validarMensagem(String mensagem) throws Validacao {
		Optional<String> mensagemValida = Optional.ofNullable(mensagem);
		if (mensagemValida.isEmpty() || mensagemValida.get().equals("")) {
			throw new Validacao("\nMensagem vazia.");
		}
	}
	
	public static void validarDestinatario(String destinatario, int tipoMensagem) throws Validacao {
		Optional<String> destinatarioValido = Optional.ofNullable(destinatario);
		if (destinatarioValido.isEmpty() || destinatarioValido.get().equals("")) {
			throw new Validacao("\nDestinatário vazio.");
		}
		
		switch(tipoMensagem) {
			case 1:
				if(!destinatario.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
					throw new Validacao("\nE-mail inválido."); 
				}
				break;
			case 2:
				if(!destinatario.matches("^(?:(?:\\+|00)?55\\s?)?(?:\\(?([1-9][0-9])\\)?\\s?)?(?:((?:9\\d|[2-9])\\d{3})\\-?(\\d{4}))$")) {
					throw new Validacao("\nNúmero de telefone inválido."); 
				}
				break;
			default:
				throw new Validacao("\nTipo inválido de mensagem.");
		}
	}
}
