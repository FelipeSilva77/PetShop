package sistemaDeControle;

public abstract class CalculoValorAtendimento {
	
	private double tamanho;
	
	public CalculoValorAtendimento (double tamanho){
		this.tamanho = tamanho;
	}
	
	public CalculoValorAtendimento (double tamanho,boolean tosa){
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}
	
	
}
