package br.com.fiap.investimento.test;

import br.com.fiap.investimento.model.Cliente;

public class ClienteArrayTest {

	public static void main(String[] args) {

		Cliente[] clientes = new Cliente[5];
		clientes[0] = new Cliente("Elias");
		clientes[1] = new Cliente("Fl�vio");
		clientes[2] = new Cliente("Bruno");
		clientes[3] = new Cliente("Fl�via");
		clientes[4] = new Cliente("Beatriz");

		System.out.println("Relat�rio de Clientes");
		for(int i=0; i < clientes.length; i++) {
			System.out.println(clientes[i]);
		}
		
	}

}
