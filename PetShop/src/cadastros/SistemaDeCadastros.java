package cadastros;

import exceptions.LimiteDeCadastrosException;

public class SistemaDeCadastros {
	
	private Cadastro[] cadastros;
	private int contadorDeCadastros;
	
	public SistemaDeCadastros() {
		cadastros = new Cadastro [100];
		contadorDeCadastros = 0;
	}
	
	public boolean CriarCadastro(int numero) throws LimiteDeCadastrosException {
		for(Cadastro novoCadastro : cadastros) {
			if(novoCadastro != null && novoCadastro.getNumero()==numero) {
				return false;
				
			}
		}	
		        Cadastro cadastro= new Cadastro(numero);
				cadastros[contadorDeCadastros]=cadastro;
				contadorDeCadastros++;
				if(contadorDeCadastros>cadastros.length) {
					throw new LimiteDeCadastrosException();
			    }
		return true;
	}
	
	public boolean BanhoAndTosa(int numero) {
		for(Cadastro isMyCount : cadastros) {
			if(isMyCount!=null && isMyCount.getNumero()==numero) {
				return true;
			}
		}
		return false;
	}
}
