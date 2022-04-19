package programa;

import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;
//import Classes.Soma;
//import Classes.Subtracao;
//import Classes.Multiplicacao;
import Classes.Divisao;
import interfaces.ICalculadora;

public class Programa {	
	
	public static void main(String args[]) {
				
		Integer opc = 0;
		do {
			opc = menu();
			ArrayList<Double> entrada = menuEntradaDados();
			
			Double data[] = new Double[entrada.size()];
			for (int i = 0; i < entrada.size(); i++) {
				data[i] = entrada.get(i);
			}
			String tipoEntrada = verificaTipoEntrada(data);	
			
			switch (opc) {
			case 1:
//				ICalculadora soma = new Soma();
//				
//				if(tipoEntrada.equals("inteiro")) {
//					System.out.println(soma.calcula(convertDoubleToInt(data)));
//				}
//				if(tipoEntrada.equals("double")) {
//					System.out.println(soma.calcula(data));
//				}
//				if(tipoEntrada.equals("float")) {
//					System.out.println(soma.calcula(convertDoubleToFloat(data)));
//				}
				
				
				break;
			case 2:
//				interfaces.ICalculadora subtracao = new Soma();
//				
//				if(tipoEntrada.equals("inteiro")) {
//					System.out.println(subtracao.calcula(convertDoubleToInt(data)));
//				}
//				if(tipoEntrada.equals("double")) {
//					System.out.println(subtracao.calcula(data));
//				}
//				if(tipoEntrada.equals("float")) {
//					System.out.println(subtracao.calcula(convertDoubleToFloat(data)));
//				}
				break;
			case 3:
//				interfaces.ICalculadora multiplicacao = new multiplicacao();
//				
//				if(tipoEntrada.equals("inteiro")) {
//					System.out.println(multiplicacao.calcula(convertDoubleToInt(data)));
//				}
//				if(tipoEntrada.equals("double")) {
//					System.out.println(multiplicacao.calcula(data));
//				}
//				if(tipoEntrada.equals("float")) {
//					System.out.println(multiplicacao.calcula(convertDoubleToFloat(data)));
//				}
				break;
			case 4:
				ICalculadora divisao = new Divisao();
				
				if(tipoEntrada.equals("inteiro")) {
					System.out.println(divisao.calcula(convertDoubleToInt(data)));
				}
				if(tipoEntrada.equals("double")) {
					System.out.println(divisao.calcula(data));
				}
				if(tipoEntrada.equals("float")) {
					System.out.println(divisao.calcula(convertDoubleToFloat(data)));
				}
				break;
			default:
				System.out.println("Finalizando a aplicacao...");
				System.exit(0);
				break;
			}
		} while (opc != 0);
		
	}
	
	public static Integer menu() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  CALCULADORA   ==========\n");
		sb.append("===================================\n");
		sb.append("Digite 1 para realizar SOMA \n");
		sb.append("Digite 2 para realizar SUBTRACAO \n");
		sb.append("Digite 3 para realizar DIVISAO \n");
		sb.append("Digite 4 para realizar MULTIPLICACAO \n");
		sb.append("Digite 0 para encerrar \n");
		
		System.out.println(sb.toString());
		Integer opc = scan.nextInt();
		return opc;
	}
	
	public static ArrayList<Double> menuEntradaDados() {
		ArrayList<Double> entrada = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  Entrada de Dados   =====\n");
		sb.append("===================================\n");
		
		Integer usuarioQuerContinuar = 0;
		do {			
			System.out.println("Digite o numero:");
			if (scan.hasNextDouble()) {
				entrada.add(scan.nextDouble());
			}			
			if (entrada.size() >= 2) {
				System.out.println("Voce deseja inserir mais numero? [0 - SIM | 1 - Nao]");
				usuarioQuerContinuar = scan.nextInt();
			}
			
		} while (entrada.size() < 2 || usuarioQuerContinuar == 0);
	
		return entrada;
	}
	
	public static String verificaTipoEntrada(Double[] entrada) {
		Integer numeroEntradaInteiros = 0;
		Integer numeroEntradaFloat = 0;
		Integer numeroEntradaDouble = 0;
		for (int i = 0; i < entrada.length; i++) {
			
			double n = entrada[i];
			
			if ((int) n == n) {
				numeroEntradaInteiros++;
			} else if (Double.toString(n).split("\\.")[1].length() < 7) {
				numeroEntradaFloat++;
			} else {
				numeroEntradaDouble++;
			}			
		}
		
		if (numeroEntradaInteiros > 0 && numeroEntradaFloat == 0 && numeroEntradaDouble == 0) {
			return "inteiro";
		}
		
		if ((numeroEntradaInteiros > 0 || numeroEntradaInteiros == 0) && numeroEntradaFloat > 0 && numeroEntradaDouble == 0) {
			return "float";
		}
		
		return "double";
	}
	
	public static Integer[] convertDoubleToInt(Double[] vetor) {
	    Integer[] vet = new Integer[vetor.length];
	    for (int i = 0; i < vetor.length; i++) {
	    	vet[i] = (int) vetor[i].doubleValue();
	    }
	    return vet;
	}
	
	public static Float[] convertDoubleToFloat(Double[] vetor) {
	    Float[] vet = new Float[vetor.length];
	    for (int i = 0; i < vetor.length; i++) {
	    	vet[i] = Float.parseFloat(vetor[i].toString());
	    }
	    return vet;
	}
}