package exercicio2_veiculos;

public class TestaCarros {

	public static void main(String[] args) throws Validacao {
		testarCarros();
	}

	public static void criarCarroEletrico(String modelo, int velocidade, int bateria, int aceleracao) throws Validacao {
		try {
			CarroEletrico carroEletrico = new CarroEletrico(modelo, velocidade, bateria);
			carroEletrico.acelerar(aceleracao);
		} catch (Validacao excessao) {
			System.out.println(excessao.getMessage());
		}
	}

	public static void testarCarros() throws Validacao {
		// testando criar um carro elétrico de forma correta e mostrando-o logo após:
CarroEletrico carro = new CarroEletrico("Fiat Uno", 30, 10);
		
		carro.visualizar();
		
		carro.acelerar(10);
		
		carro.visualizar();

		// testando criar um carro elétrico com aceleração inválida:
		criarCarroEletrico("Chevrolet Onix", 30, 10, -1);

		// testando acelerar um carro elétrico com bateria insuficiente:
		criarCarroEletrico("Creta", 30, 9, 48);

		// tentando criar um carro elétrico com nível de bateria negativo:
		criarCarroEletrico("Microonibus", 30, -1, 10);

		// tentando criar um carro elétrico com nível de bateria acima de 100:
		criarCarroEletrico("Opala", 30, 101, 10);
	}

}
