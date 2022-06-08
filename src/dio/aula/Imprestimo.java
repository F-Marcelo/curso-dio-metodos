package dio.aula;

public class Imprestimo {

	public static double getTxDuasParc() {
		return 0.3;
	}

	public static double getTxTresParc() {
		return 0.45;
	}

	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTxDuasParc());
			System.out.println("Valor para duas parcelas R$ " + valorFinal);
		} else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTxTresParc());
			System.out.println("Valor para três parcelas R$ " + valorFinal);
		} else {
			System.out.println("Valor de parcela inválido");
		}
	}

}
