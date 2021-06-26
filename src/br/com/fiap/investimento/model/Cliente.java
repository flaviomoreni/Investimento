package br.com.fiap.investimento.model;

public class Cliente {
	
	private int clienteId;
	private String cpf;
	private String nome;
	private String email;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	
	
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
	
}
