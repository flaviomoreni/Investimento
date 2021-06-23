package br.com.fiap.investimento.model;

public class Fundo {

	private int fundoId;
	private String nomeFundo;
	private boolean ativo;
	
	
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
	
	
	
}
