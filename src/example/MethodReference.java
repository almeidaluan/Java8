package example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReference {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Abacate");
		palavras.add("Maca");
		palavras.add("Uva");
		palavras.add("morango");
		
		palavras.sort(Comparator.comparing(String::length));
		palavras.forEach(System.out::println);
		
		
		
	}
}
