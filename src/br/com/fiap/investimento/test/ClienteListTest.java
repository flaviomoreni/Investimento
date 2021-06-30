package br.com.fiap.investimento.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.fiap.investimento.dao.ClienteDAO;
import br.com.fiap.investimento.dao.GenericDAO;
import br.com.fiap.investimento.model.Cliente;

public class ClienteListTest {

	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente("Elias");
		Cliente c2 = new Cliente("Flávio");
		Cliente c3 = new Cliente("Bruno");
		Cliente c4 = new Cliente("Flávia");
		Cliente c5 = new Cliente("Beatriz");
		Cliente c6 = new Cliente("Flávio");
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
		clientes.add(c1);
		clientes.add(c3);
		clientes.add(c2);
		clientes.add(c4);
		clientes.add(c5);
		clientes.add( new Cliente("Felipe") );
		clientes.add(c1);
		clientes.add(c2);

		System.out.println(clientes.contains(c6));
		int posicaoBusca = clientes.indexOf(c6);
		System.out.println(posicaoBusca);
		
		/*
		ArrayList<Cliente> clientes2 = new ArrayList<Cliente>(); 
		clientes2.add( new Cliente("Kledson"));
		clientes2.addAll(clientes);
		
		
		for (Cliente c : clientes2) {
			System.out.println(c);
		}
		*/	
		
		/*
		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i);
			System.out.println(c);
		}
		*/
		
	}

}
