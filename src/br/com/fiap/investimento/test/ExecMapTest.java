package br.com.fiap.investimento.test;

import java.util.Map;
import java.util.TreeMap;

import br.com.fiap.investimento.model.InvestidorPF;

public class ExecMapTest {

	public static void main(String[] args) {
		

		try {
			System.out.println("1 - Iniciando a execução");
			
			//int a = 1 / 0;
			
			InvestidorPF inv = new InvestidorPF();
			//int tamanho = inv.getNomeInvestidor().length();
			
			System.out.println("1.1 - Depois do erro tamanho do nome");
			
			String[] lista = {"Elias", "Souza" , "Soares"};
			String a = lista[4];
			
		} catch ( NullPointerException e ) {
			System.out.println("2 - Tratando o erro nullpoint");
		} catch ( ArithmeticException e ) {
			System.out.println("2 - Tratando o erro Arithmetic");
		} catch ( Exception e) {
			System.out.println("2 - Tratando o erro Exception");
		} finally {
			System.out.println("3 - Finalizando o meu programa");
		}
		
		
		
	}
	
}
