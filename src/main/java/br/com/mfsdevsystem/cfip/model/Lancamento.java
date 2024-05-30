package br.com.mfsdevsystem.cfip.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tb_lancamento")
public class Lancamento extends LogImpl {

	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date data;
	
	@Column(length=50,nullable=false)
	private String descricao;
	
	@Column(length=8, precision=2,nullable=false)
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="conta_id", nullable=false)
	private Conta conta;
	
	@ManyToOne
	@JoinColumn(name="natureza_id", nullable=false)
	private Natureza natureza;

	public Lancamento() {	
	}
	
	public Lancamento(Date data, String descricao, Double valor, Conta conta, Natureza natureza) {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		this.conta = conta;
		this.natureza = natureza;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Natureza getNatureza() {
		return natureza;
	}

	public void setNatureza(Natureza natureza) {
		this.natureza = natureza;
	}

	
	
	
}
