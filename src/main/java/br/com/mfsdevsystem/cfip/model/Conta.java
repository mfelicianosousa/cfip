package br.com.mfsdevsystem.cfip.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_conta")
public class Conta extends LogImpl {
	
	private static final long serialVersionUID = 1L;
	
	@Column(length=50,nullable=false)
	private String nome;
	
	@Column(length=8, precision=2,nullable=false)
	private Double saldo;
	
	@Column(name="cartao_cred", length=1, nullable=false)
	private boolean cartaoCredito;
		
	public Conta() {
		
	}
	
	public Conta(String nome, Double saldo, boolean cartaoCredito) {
		this.nome = nome;
		this.saldo = saldo;
		this.cartaoCredito = cartaoCredito;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public boolean isCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(boolean cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	@Override
	public String toString() {
		return "Conta [ nome=" + nome + ", saldo=" + saldo + ", cartaoCredito=" + cartaoCredito + "]";
	}

	
	
}
