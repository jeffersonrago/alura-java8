package br.com.jeffersonrago.alura.java8.capitulo1;

public class Exercicio6 {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}

}
