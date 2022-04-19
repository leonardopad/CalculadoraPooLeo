package Classes;

import interfaces.ICalculadora;

public class Divisao implements ICalculadora {
	
	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if(n1 == 0 || n2 == 0) {
			return 0;
		}else {
		return n1 / n2;
		}
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		if(n1 == 0 || n2 == 0) {
			return 0f;
		}else {
		return n1 / n2;
		}
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		if(n1 == 0 || n2 == 0) {
			return 0d;
		}else {
		return n1 / n2;
		}
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] == 0) {
				return 0;
			}else {
			divisao /= numeros[i];
			}
		}
		return divisao;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] == 0) {
				return 0f;
			}else {
			divisao /= numeros[i];
			}
		}
		return divisao;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double divisao = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] == 0) {
				return 0d;
			}else {
			divisao /= numeros[i];
			}
		}
		return divisao;
	}
}