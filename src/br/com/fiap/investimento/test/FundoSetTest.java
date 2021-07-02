package br.com.fiap.investimento.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import br.com.fiap.investimento.model.Fundo;

public class FundoSetTest {

	public static void main(String[] args) {
		
		Fundo f1 = new Fundo("Fundo F1"); //0x0005
		
		Set<Fundo> fundos = new HashSet<Fundo>();
		fundos.add( new Fundo("Fundo 55") );
		fundos.add( new Fundo("Fundo 2") ); //0X0002
		fundos.add( new Fundo("Fundo 1") ); //0X0001
		fundos.add( new Fundo("Fundo 3") ); //0X0003
		fundos.add( new Fundo("Fundo 1") ); //0X0004cls
		fundos.add( new Fundo("Fundo 2") );
		fundos.add( new Fundo("Fundo 4") );
		fundos.add(f1);
		fundos.add(f1);
		
		
		for (Fundo fundo : fundos) {
			System.out.println(fundo);
		}
		
		
	}

}
