package br.com.fiap.investimento.test;

import java.util.ArrayList;

public class StringListTest {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>(); 
		lista.add("Flávio");
		lista.add("Felipe");
		lista.add("Beatriz");
		lista.add("Bruno");
		lista.add("Talita");
		
		System.out.println( lista.contains("Felipe") );
		System.out.println( lista.indexOf("Felipe") );

	}

}
