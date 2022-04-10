package sistemaDeControle;

public class CalculoLimpezaGato extends CalculoAtendimentoGato {

	public CalculoLimpezaGato(double tamanho) {
		super(tamanho);
	}
	
	public CalculoLimpezaGato(double tamanho,boolean porte) {
		super(tamanho,true);
	}

}
