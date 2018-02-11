package br.com.jeffersonrago.alura.java8.capitulo3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		System.out.println(palavras);

		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length()) {
					return -1;
				} else if (s1.length() > s2.length()) {
					return 1;
				}

				return 0;
			}
		});

		System.out.println(palavras);

		// Lambda
		palavras.sort((String s1, String s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			} else if (s1.length() > s2.length()) {
				return 1;
			}

			return 0;
		});

		System.out.println(palavras);

		palavras.sort((s1, s2) -> {
			return Integer.compare(s1.length(), s2.length());
		});

		System.out.println(palavras);
		
		

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);
		
		
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);
		
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		
		palavras.sort(Comparator.comparing(s -> s.endsWith("a")));
		System.out.println(palavras);

		// Classe anonima
		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};

		palavras.forEach(consumidor);

		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		// Lambda
		palavras.forEach((String t) -> {
			System.out.println(t);
		});

		palavras.forEach(t -> {
			System.out.println(t);
		});

		Consumer impressor = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);
		
		

	}

}

