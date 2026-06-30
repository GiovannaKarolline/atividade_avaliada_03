package exercicio2_veiculos;

public class Carro {
	String modelo;
	int velocidade;
	
	public Carro(String modelo, int velocidade) {
		this.modelo = modelo;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void visualizar() {
		System.out.printf("\nModelo: ", this.modelo);
		System.out.printf("\nVelocidade atual: ", this.velocidade);
	}
	
	public void acelerar(int valor) throws Validacao{
		this.velocidade += valor;
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
