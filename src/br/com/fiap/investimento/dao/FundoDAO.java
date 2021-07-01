package br.com.fiap.investimento.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.fiap.investimento.model.Fundo;

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
	
	public List<Fundo> listarTodos() {
		
		// Processamento
		System.out.println("SELECT fundoId, nomeFundo, ativo FROM fundo ORDER BY nomeFundo;");
		
		List<Fundo> fundos = new ArrayList<Fundo>();
		fundos.add( new Fundo("Fundo 1") );
		fundos.add( new Fundo("Fundo 2") );
		fundos.add( new Fundo("Fundo 3") );
		fundos.add( new Fundo("Fundo 4") );
		fundos.add( new Fundo("Fundo 5") );
		
		// Saída - return
		return fundos;
	}
	
}
