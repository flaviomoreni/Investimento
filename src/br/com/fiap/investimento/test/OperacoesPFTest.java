package br.com.fiap.investimento.test;

import br.com.fiap.investimento.action.OperacoesPF;

public class OperacoesPFTest {

	public static void main(String[] args) {
		
		OperacoesPF operacoesPF = new OperacoesPF();
		operacoesPF.aplicar();
		operacoesPF.resgatarTotal();
		operacoesPF.resgatarParcial();
		
	}

}
