package br.com.fiap.investimento.action;

public class OperacoesPF extends Operacoes {
	
	@Override
	public void aplicar() {
		System.out.println("Validando o reconhecimento facial");
		System.out.println("**********");
		super.aplicar();
	}
	
	
	public void resgatarTotal() {
		System.out.println("PF - Resgate Total executado com sucesso");
	}
	
	public void estornar() {
		System.out.println("PF - Estorno executado com sucesso");
	}
	
}
