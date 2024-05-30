package br.com.mfsdevsystem.cfip.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@MappedSuperclass
public abstract class LogImpl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Embedded
	private Log log;
	
	public Log getLog() {
		return log;
	}
	
	@PrePersist
	private void inclusao() {
	    log = new Log();
		log.setDataInclusao( new Date());	
	}
	
	@PreUpdate
	private void alteracao() {
		log.setDataAlteracao( new Date());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogImpl other = (LogImpl) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
