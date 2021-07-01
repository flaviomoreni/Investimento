package br.com.fiap.investimento.test;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.jar.JarEntry;

import br.com.fiap.investimento.dao.FundoDAO;
import br.com.fiap.investimento.model.Fundo;

public class FundoTelaListaTest {

	public static void main(String[] args) {
		
		FundoDAO fundoDAO = new FundoDAO();
		List<Fundo> lista = fundoDAO.listarTodos();
		
		//HTML - imprimir a tabela com todos fundos
		for (Fundo fundo : lista) {
			System.out.println(fundo);
		}
		
	}

}
