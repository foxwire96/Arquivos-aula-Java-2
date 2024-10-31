package aula0;

public class EstruturasDeControle2 {
	public static void main(String[] args) {
		int nota = 5; //não funciona com switch, pois o switch não avalia intervalo

		int mes = 13;
		String mesPorNome = null;

		switch (mes) {
			case 1:
				mesPorNome = "Janeiro";
				break;
			case 2: 
				mesPorNome = "Fevereiro";
				break;
			case 3: 
				mesPorNome = "Março";
				break;
			case 4: 
				mesPorNome = "Abril";
				break;
			case 5: 
				mesPorNome = "Maio";
				break;
			case 6: 
				mesPorNome = "Junho";
				break;
			case 7: 
				mesPorNome = "Julho";
				break;
			case 8: 
				mesPorNome = "Agosto";
				break;
			case 9: 
				mesPorNome = "Setembro";
				break;
			case 10: 
				mesPorNome = "Outubro";
				break;
			case 11: 
				mesPorNome = "Novembro";
				break;
			case 12: 
				mesPorNome = "Dezembro";
				break;
			default: mesPorNome = "mês inválido";
				break;
		}
		System.out.println("Estamos no mês de "+mesPorNome);
	}
}