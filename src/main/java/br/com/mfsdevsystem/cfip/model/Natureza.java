package br.com.mfsdevsystem.cfip.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_natureza")
public class Natureza extends LogImpl {
	
	private static final long serialVersionUID = 1L;
	
	@Column(length=50, nullable=false)
	private String nome;
	
	@Enumerated(EnumType.STRING) // EnumType.ORDINAL
	@Column(name="tipo_mov_id", nullable=false, length=30)
	private TipoMovimento tipoMovimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name="categoria_id", length=50)
	private Categoria categoria;
			
	public Natureza() {
		
	}
	
	public Natureza(String nome, TipoMovimento tipoMovimento, Categoria categoria) {
		this.nome = nome;
		this.tipoMovimento = tipoMovimento;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(TipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
