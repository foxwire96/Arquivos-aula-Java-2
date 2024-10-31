package usandolibs;

public class TestaString2 {

	public static void main(String[] args) {
		//Vamos testar os seguintes métodos de String:
		//split, compareTo, compareToIgnoreCase
		//toUpperCase, toLowerCase, charAt, length, substring, trim
		//indexOf, lastIndexOf, isEmpty, contains, matches
		//replace, replaceAll
		String a = ("Aprendendo Java no Senac");
		String b = ("Aprendendo Java no Senac");
		
		String c[] = a.split("");
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		String d = "aprendendo java no senac";
		int i =a.compareTo(a);
		System.out.println(i);
		
		int j = a.compareTo(d);
		System.out.println(j);
		
		int k = a.compareToIgnoreCase(d);
		System.out.println(k);
		
		System.out.println(d.toUpperCase());
		System.out.println(b.toLowerCase());
		
		System.out.println(a.charAt(9));
		System.out.println(a.length());
		
		System.out.println(a.substring(5));
		System.out.println(a.substring(5,10));
		
		System.out.println(a.trim());
		
		System.out.println(a.indexOf("A"));
		System.out.println(a.indexOf("a"));
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.lastIndexOf("A"));
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		
		System.out.println(a.contains("Java"));
		System.out.println(a.replace("a","o"));
		
	}

}
