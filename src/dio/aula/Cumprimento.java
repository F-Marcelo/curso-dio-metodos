package dio.aula;



public class Cumprimento {
	
	public static void Mensagem(int hora) {
		if (hora >= 5 && hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		}
		else if (hora >= 18 && hora < 24 || hora >= 1 && hora < 5) {
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Valor inválido");
		}
		
	}

}
