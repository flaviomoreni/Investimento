package br.com.fiap.investimento.model;

public class Fundo implements Comparable<Fundo> {

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
	
	
	@Override
	public boolean equals(Object obj) {
		boolean retorno = false;
		
		if(obj instanceof Fundo) {
			Fundo outroFundo = (Fundo) obj;
			if ( this.nomeFundo.equals(outroFundo.getNomeFundo()) ) {
				retorno = true;
			}
		}
		
		return retorno;
	}

	
	
	@Override
	public int hashCode() {
		return this.fundoId;
	}
	
	
	@Override
	public int compareTo(Fundo outro) {
		return this.nomeFundo.compareTo(outro.nomeFundo);
	}

	
	
	
	
}
