package br.com.jeffersonrago.alura.java8.capitulo6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class Datas {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(20299, Month.JANUARY, 25);
		
		int ano = olimpiadasRio.getYear() - hoje.getYear();
		
		System.out.println(ano);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		
		System.out.println(periodo.getDays());
		
		LocalDate proximaOlimpiadas = olimpiadasRio.plusYears(4);
		
		System.out.println(proximaOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(proximaOlimpiadas.format(formatador));
		
		DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora.format(formatadorComHora));
		
		LocalTime intervalo = LocalTime.of(16, 32);
		System.out.println(intervalo);
		
	}

}
