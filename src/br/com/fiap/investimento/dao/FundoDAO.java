package br.com.fiap.investimento.dao;

public class FundoDAO implements GenericDAO {

	public void cadastrar() {
		System.out.println("INSERT INTO fundo (fundoId, nomeFundo, ativo) VALUES (1, 'FUNDO 1', 0);");
	}
	
	public void excluir() {
		System.out.println("DELETE fundo WHERE fundoId = 3;");
	}
	
	public void alterar() {
		System.out.println("UPDATE fundo SET nomeFundo = 'Fundo 1.1', ativo = true WHERE fundoId = 1;");
	}
	
	public void consultarPorId() {
		System.out.println("SELECT fundoId, nomeFundo, ativo FROM fundo WHERE fundoId = 1;");
	}
	
	public void buscarTodos() {
		System.out.println("SELECT fundoId, nomeFundo, ativo FROM fundo;");
	}
	
	public void buscarTodos(String nome) {
		
	}
	
	

}
