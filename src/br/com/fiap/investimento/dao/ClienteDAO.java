package br.com.fiap.investimento.dao;

public class ClienteDAO implements GenericDAO {

	public void cadastrar() {
		System.out.println("INSERT INTO ClienteDAO ...;");
	}

	public void excluir() {
		System.out.println("DELETE ClienteDAO WHERE investidorId = 3;");

	}

	
	public void alterar() {
		System.out.println("UPDATE ClienteDAO ...;");
	}

	
	public void buscarTodos() {
		System.out.println("SELECT fundoId, nomeFundo, ativo FROM fundo;");
	}
	
	
	public void consultarPorId() {
		System.out.println("SELECT fundoId, nomeFundo, ativo FROM fundo WHERE fundoId = 1;");
	}
	
}
