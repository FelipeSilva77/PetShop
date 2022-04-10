package menus;

import java.util.Scanner;

import exceptions.TamanhoNaoPermitidoException;
import sistemaDeControle.CalculoAtendimentoGato;
import sistemaDeControle.CalculoLimpezaGato;
import cadastros.SistemaDeCadastros;
import exceptions.LimiteDeCadastrosException;

public class MenuGato implements Menu {
	
		static Scanner scan = new Scanner(System.in);
		
		int escolha, numeroDaConta;
		double tamanho;
		boolean resultado;
		
		@Override
		public void Menu() throws Exception {
			do {
			System.out.println("VAMOS CUIDAR DO SEU PET !!!");
			System.out.println();
			System.out.println("Digite 0 - Sair.");
			System.out.println("Digite 1 - Criar o cadastro do seu gato.");
			System.out.println("Digite 2 - Marcar o banho do seu gato.");
			System.out.println("Digite 3 - Marcar a Tosa do seu gato.");
			escolha=scan.nextInt();
			switch(escolha) {
			case 1: 
				RealizarCadastro();
				break;
				case 2: 
					CalcularBanhoGato();
			    	break;
			    	case 3:
			    		CalcularTosaGato();
			    		break;
			    	        case 0:
			    	        	System.out.println("Programa encerrado.");
			    	        	break;
			    	        default:
			    	            System.out.println("Opção inválida. Digite um dos números do menu.");
			    	                break;
			}
			}while(escolha!=0);
	}

		private void CalcularBanhoGato() throws TamanhoNaoPermitidoException {
			System.out.println("Digite o número do cadastro");
			numeroDaConta = scan.nextInt();
			System.out.println("Digite o tamanho do seu gato(cm).");
			tamanho = scan.nextDouble();
			if(tamanho<7 || tamanho>46) {
				throw new TamanhoNaoPermitidoException();
			}
			CalculoAtendimentoGato valor = new CalculoLimpezaGato(tamanho);
			System.out.println("O valor do banho é "+valor.calculoBanho());
			System.out.println("O banho foi marcado: "+resultado);
		}

		private void CalcularTosaGato() throws TamanhoNaoPermitidoException {
			System.out.println("Digite o número do cadastro");
			numeroDaConta = scan.nextInt();
			System.out.println("Digite o tamanho do seu gato(cm).");
			tamanho = scan.nextDouble();
			if(tamanho<7 || tamanho>46) {
				throw new TamanhoNaoPermitidoException();
			}
			CalculoAtendimentoGato valor = new CalculoLimpezaGato(tamanho);
			System.out.println("O valor do tosa é "+valor.calculoTosa());
			System.out.println("A tosa foi marcada: "+resultado);
		}
		
		private void RealizarCadastro() throws LimiteDeCadastrosException {
			SistemaDeCadastros s = new SistemaDeCadastros();
			System.out.println("VAMOS CRIAR O CADASTRO DO SEU GATINHO.");
			System.out.println("Digite o número do cadastro:");
			numeroDaConta = scan.nextInt();
			resultado=s.CriarCadastro(numeroDaConta);
			System.out.println("O cadastro foi realizado: "+resultado);
		}
		
}
