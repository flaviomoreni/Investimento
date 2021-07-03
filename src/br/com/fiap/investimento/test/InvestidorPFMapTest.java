package br.com.fiap.investimento.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorPFMapTest {

	public static void main(String[] args) {
		//List<InvestidorPF> lista = new ArrayList<InvestidorPF>();
		//Set<String> sett = new HashSet<String>();
		
		InvestidorPF i1 = new InvestidorPF(1,"111.111.111-11", "Cristiano Romário");
		InvestidorPF i2 = new InvestidorPF(2,"222.222.222-22", "Lionel Ronaldo");
		InvestidorPF i3 = new InvestidorPF(3,"333.333.333-33", "Kylian Lewandowski");
		InvestidorPF i4 = new InvestidorPF(4,"444.444.444-44", "Sadio Salah");
		InvestidorPF i5 = new InvestidorPF(5,"555.555.555-55", "Mohamed Mané");

		Map<String, InvestidorPF> mapaInvestidor = new HashMap<String, InvestidorPF>();
		mapaInvestidor.put( i1.getCpf() , i1);
		mapaInvestidor.put( i2.getCpf() , i2);
		mapaInvestidor.put( i3.getCpf() , i3);
		mapaInvestidor.put( i4.getCpf() , i4);
		mapaInvestidor.put( i5.getCpf() , i5);
		
		for (String chave : mapaInvestidor.keySet()) {
			System.out.print(chave + " - ");
		}
		System.out.println("");
		
		for (InvestidorPF investidor: mapaInvestidor.values()) {
			System.out.print(investidor.getNomeInvestidor() + " - ");
		}
		System.out.println("");
		
		
		//Procurando um investidor pelo CPF
		String cpfDigitado = "333.333.333-33";
		if ( mapaInvestidor.containsKey(cpfDigitado) ) {
			InvestidorPF investidorBusca = mapaInvestidor.get(cpfDigitado);
			System.out.println("Cpf encontrado no banco");
			System.out.println(investidorBusca);
		} else {
			System.out.println("Cpf não cadastrado");
		}
		
		
		
	}

}
