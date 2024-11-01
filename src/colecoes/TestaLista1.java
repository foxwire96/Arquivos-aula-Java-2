package colecoes;

import java.util.ArrayList;
import java.util.List;

public class TestaLista1 {
	public static void main(String[] args) {
	List lista1 = new ArrayList();
	lista1.add("Anderson");
	lista1.add("Arthur");
	lista1.add("Thamires");
	
	int i = lista1.size();
	System.out.println(i);
	System.out.println(lista1.size());
	System.out.println(lista1);
	lista1.remove("Anderson");
	System.out.println(lista1);
	System.out.println(lista1.size());
	
	List<String> lista2 = new ArrayList<String>();
	lista2.add("Anderson");
	lista2.add("Arthur");
	lista2.add("Thamires");
	lista2.add("Anderson");
	System.out.println(lista2.size());
	}
}
