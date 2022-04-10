package sistemaDeControle;

public class CalculoAtendimentoCachorro extends CalculoValorAtendimento {

	public CalculoAtendimentoCachorro(double tamanho) {
		super(tamanho);
	}
	
	public CalculoAtendimentoCachorro(double tamanho,boolean porte) {
		super(tamanho,porte);
	}
	
	public double calculoTosa() {
		return getTamanho() * 1.0;
	}
	
	public double calculoBanho() {
		return getTamanho() * 1.2;
	}
}
