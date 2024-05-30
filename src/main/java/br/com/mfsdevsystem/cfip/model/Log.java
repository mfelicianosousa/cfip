package br.com.mfsdevsystem.cfip.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
public class Log {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_inclusao", nullable=false)
	private Date dataInclusao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_alteracao")
	private Date dataAlteracao; 

	
	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
}
