package aula0;

public class TestaOperadores {
	public static void main(String[] args) {
	//i++ -> avalia a expressão antes do valor ser acrescido
	//i-- -> avalia a expressão antes do valor ser decrescido
	//++i -> o valor é acrescido e depois a expressão é avaliada
	//--i -> o valor é decrescido e depois a expressão é avaliada
	
		int i = 5;
		System.out.println(i);
		
		//int j = i++;
		int j = ++i;
		System.out.println(j);
		System.out.println(i);
		
		int m = 10;
		int n = 5;
		//int k = n++ + m;
		int k = ++n + m;
		System.out.println(k);
		System.out.println(n);
		
		
	}

}
