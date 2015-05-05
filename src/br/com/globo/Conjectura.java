package br.com.globo;

public class Conjectura {

	protected static Long max = 0L;
	protected static Long numbs = 0L;
	protected static Long numbsMax = 0L;
	private static final Long inicio = 2L;

	public static void main(String[] args) {
		Long resultado = processaCollatz(1000000l);
		System.out.println("Resultado:" + resultado);
	}

	protected static Long processaCollatz(Long valorMaximo) {
		for (Long i = inicio; i < valorMaximo; i++) {
			calcula(i);
			if (numbs > numbsMax) {
				numbsMax = numbs;
				max = i;
			}
			numbs = 0L;
		}
		return max;
	}

	protected static void calcula(Long numero) {

		numbs = numbs + 1;
		if (numero == 1) {
			return;
		}
		if (numero % 2 > 0) {
			numero = 3 * numero + 1;
		} else {
			numero = numero / 2;
		}
		calcula(numero);
	}
}
