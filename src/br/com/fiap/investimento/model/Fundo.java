package br.com.fiap.investimento.model;

public class Fundo {

	private int fundoId;
	private String nomeFundo;
	private boolean ativo;
	
	
	public Fundo() {
	}
	
	public Fundo(int fundoId) {
		this.fundoId = fundoId;
	}
	
	public Fundo(String nome) {
		this.nomeFundo = nome;
	}
	
	public Fundo(int fundoId, String nome) {
		this.fundoId = fundoId;
		this.nomeFundo = nome;
	}
	
	public int getFundoId() {
		return fundoId;
	}
	public void setFundoId(int fundoId) {
		this.fundoId = fundoId;
	}
	public String getNomeFundo() {
		return nomeFundo;
	}
	public void setNomeFundo(String nomeFundo) {
		this.nomeFundo = nomeFundo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
	@Override
	public String toString() {
		return "Fundo [fundoId=" + fundoId + ", nomeFundo=" + nomeFundo + "]";
	}
	
	
	
	
}
