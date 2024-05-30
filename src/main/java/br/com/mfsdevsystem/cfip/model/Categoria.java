package br.com.mfsdevsystem.cfip.model;

public enum Categoria {
    A("ALIMENTACAO"),
    B("BEBIDA");
	private String nome;
	private Categoria(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
