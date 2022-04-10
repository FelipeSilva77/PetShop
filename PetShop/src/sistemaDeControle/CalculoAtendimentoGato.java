package sistemaDeControle;

public class CalculoAtendimentoGato extends CalculoValorAtendimento {

	public CalculoAtendimentoGato(double tamanho) {
		super(tamanho);
	}
	
	public CalculoAtendimentoGato(double tamanho,boolean porte) {
		super(tamanho,porte);
	}
	
	public double calculoBanho() {
		return getTamanho() * 1.5;
	}
	public double calculoTosa() {
		return getTamanho() * 2.0;
	}
}
