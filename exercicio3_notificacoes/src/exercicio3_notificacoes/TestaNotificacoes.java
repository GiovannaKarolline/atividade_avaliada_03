package exercicio3_notificacoes;

public class TestaNotificacoes {
	public static void main(String[] args) throws Validacao {

		// usando número em notificação de e-mail:
		criarNotificacao(1, "11912345678", "Olá! Como você esta?");

		// usando e-mail em notificação de sms:
		criarNotificacao(2, "email@email.com", "Bem. E você?");

		// usando número e e-mail corretamente:
		criarNotificacao(1, "email@email.com", "Olá! Como você esta?");
		criarNotificacao(2, "11912345678", "Bem. E você?");

		// tentando criar notificação com mensagem vazia:
		criarNotificacao(1, "email@email.com.br", "");

		// tentando criar notificação com destinatario vazio:
		criarNotificacao(1, "", "Oi.");

		// tentando criar notificação de tipo inexistente:
		criarNotificacao(3, "email@email.com.br", "Ok!");

	}

	public static void criarNotificacao(int tipo, String destinatario, String mensagem) throws Validacao {
		switch (tipo) {
		case 1:
			try {
				NotificacaoEmail notificacao = new NotificacaoEmail(destinatario);
				notificacao.enviar(mensagem);
			} catch (Validacao erro) {
				System.out.println(erro.getMessage());
			}
			break;
		case 2:
			try {
				NotificacaoSMS notificacao = new NotificacaoSMS(destinatario);
				notificacao.enviar(mensagem);
			} catch (Validacao erro) {
				System.out.println(erro.getMessage());
			}
			break;
		default:
			try {
				Notificacao notificacao = new Notificacao(destinatario, tipo);
				notificacao.enviar(mensagem);
			} catch (Validacao erro) {
				System.out.println(erro.getMessage());
			}
			break;
		}
	}
}
