package br.com.mfsdevsystem.cfip.model;

import java.io.Serializable;

public enum TipoMovimento implements Serializable {

	C(false,"CREDITO"),
	D(false,"DEBITO"),
	T(true,"TRANSFERENCIA");
	
	private boolean transferencia;
	private String nome;
	private TipoMovimento(boolean transferencia, String nome) {
		this.transferencia = transferencia;
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public boolean isTransferencia() {
		return transferencia;
	}
}
