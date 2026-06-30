package exercicio2_veiculos;

public class CarroEletrico extends Carro{
	final int CONSUMO_POR_ACELERACAO = 2;
	int nivelBateria;

	public CarroEletrico(String modelo, int velocidade, int nivelBateria) throws Validacao {
		super(modelo, velocidade);
		Validacao.validarNivelBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) throws Validacao {
		Validacao.validarNivelBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("\nBateria restante: ", this.nivelBateria);
	}
	
	@Override
	public void acelerar(int valor) throws Validacao {
		Validacao.validarSuficienciaBateria(this.nivelBateria, (valor/CONSUMO_POR_ACELERACAO));
		Validacao.validarAceleracao(valor);
		this.nivelBateria -= valor/CONSUMO_POR_ACELERACAO;
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return super.getModelo();
	}

	@Override
	public void setModelo(String modelo) {
		// TODO Auto-generated method stub
		super.setModelo(modelo);
	}

	@Override
	public int getVelocidade() {
		// TODO Auto-generated method stub
		return super.getVelocidade();
	}

	@Override
	public void setVelocidade(int velocidade) {
		// TODO Auto-generated method stub
		super.setVelocidade(velocidade);
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
