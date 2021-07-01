package br.com.fiap.investimento.test;

import java.util.ArrayList;

import br.com.fiap.investimento.model.Fundo;

public class FundoListTest {

	public static void main(String[] args) {
		
		Fundo fundo1 = new Fundo("Fundo 1");
		Fundo fundo2 = new Fundo("Fundo 2");
		Fundo fundo3 = new Fundo("Fundo 3");
		Fundo fundo4 = new Fundo("Fundo 4");
		Fundo fundo5 = new Fundo("Fundo 5");
		
		
		ArrayList<Fundo> fundos = new ArrayList<Fundo>();
		fundos.add(fundo2);
		fundos.add(fundo3);
		fundos.add(fundo1);
		fundos.add(fundo4);
		fundos.add(fundo5);
		
		for (Fundo fundo : fundos) {
			System.out.println(fundo);
		}
		
		
		Fundo fundoPesquisa = new Fundo("Fundo 1");
		
		System.out.println( fundos.contains( fundoPesquisa ) );
		System.out.println( fundos.indexOf( fundoPesquisa ) );
		
		/*
		Fundo fundo1 = new Fundo("Fundo 1");
		Fundo fundo2 = new Fundo("Fundo 1");
		
		System.out.println( fundo1.equals(fundo2) );
		System.out.println( fundo1.getNomeFundo().equals(fundo2.getNomeFundo()));
		*/
		
		
		/*
		String a = "Flavio"; //0xfff01
		String b = "Flavio"; //0xfff02
		
		if ( a.equals(b) ) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		*/

	}

}
