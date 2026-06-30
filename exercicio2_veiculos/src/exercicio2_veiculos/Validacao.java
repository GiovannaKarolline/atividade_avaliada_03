package exercicio2_veiculos;

import java.io.PrintStream;
import java.io.PrintWriter;

public class Validacao extends Exception{

	private static final long serialVersionUID = 1L;

	public Validacao() {}
	
	public Validacao(String mensagem) {
		super(mensagem);
	}
	
	public static void validarAceleracao(int aceleracao) throws Validacao{
		if(aceleracao < 1 || aceleracao > 100) {
			throw new Validacao("\nValor de aceleração inválido. Ela é medida de 1 a 100.");
		}
	}
	
	public static void validarNivelBateria(int nivelBateria) throws Validacao{
		if(nivelBateria < 0 || nivelBateria > 100) {
			throw new Validacao("\nNível de bateria inválido. Ele é medido de 0 a 100.");
		}
	}
	
	public static void validarSuficienciaBateria(int nivelBateria, int consumo) throws Validacao {
		if(nivelBateria < consumo) {
			throw new Validacao("\nNível de bateria insuficiente. O consumo é maior que o nível de bateria disponível.");
		}
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return super.getLocalizedMessage();
	}

	@Override
	public synchronized Throwable getCause() {
		// TODO Auto-generated method stub
		return super.getCause();
	}

	@Override
	public synchronized Throwable initCause(Throwable cause) {
		// TODO Auto-generated method stub
		return super.initCause(cause);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}

	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	}

	@Override
	public void printStackTrace(PrintWriter s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		// TODO Auto-generated method stub
		return super.fillInStackTrace();
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}

	@Override
	public void setStackTrace(StackTraceElement[] stackTrace) {
		// TODO Auto-generated method stub
		super.setStackTrace(stackTrace);
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
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}