package br.com.jeffersonrago.alura.java8.capitulo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		Collections.sort(palavras);
		
		System.out.println(palavras);
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		Collections.sort(palavras, comparador);
		
		System.out.println(palavras);
		
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		for (String p : palavras) {
			System.out.println(p);
		}
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
		
	}
			

}


class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) {
			return -1;
		}else if(s1.length() > s2.length()) {
			return 1;
		}
		
		return 0;
	}
	
}
