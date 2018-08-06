package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStringModoAntigo {

	public static void main(String... args) {
	
		List<String> listaDePalavras = new ArrayList<String>();
		listaDePalavras.add( "Ab" );
		listaDePalavras.add( "CDfff" );
		listaDePalavras.add( "BDf" );
		listaDePalavras.add( "ghij" );
		listaDePalavras.add( "khlmno" );
		
		ComparadorPorTamanho comparadorPorTamanho = new ComparadorPorTamanho();
		
		Collections.sort( listaDePalavras,comparadorPorTamanho ); 
		
		
		for (String listaPalavras : listaDePalavras) {
			System.out.println(listaPalavras);
		}
		
		
	}
}	

	class ComparadorPorTamanho implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			if(s1.length() < s2.length()) 
				return -1;
			if(s1.length() > s2.length())
				return 1;
			return 0;
		}
		
		
		
	}

