package example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStringModoNovo {

	public static void main(String... args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("ubcd");
		palavras.add("ub");
		palavras.add("ubc");
		palavras.add("u");
		
		
		//ComparadorPorTamanho02 comparadorPorTamanho02 = new ComparadorPorTamanho02(); 
		
//		palavras.sort((s1,s2) ->{
//			if(s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		}); 
//		
		palavras.sort((s1,s2) ->Integer.compare(s1.length(), s2.length()));
		
		palavras.forEach(s1 ->System.out.println(s1));
	
	}
}


class ComparadorPorTamanho02 implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

	
	
}
