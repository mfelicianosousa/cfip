package br.com.mfsdevsystem.cfip.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.mfsdevsystem.cfip.model.Conta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.transaction.Transactional;

@Repository
public class ContaDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void salvar(Conta conta) {
		em.persist(conta);
	}
	
	// JPQL
	public List<Conta> listar(){
		
		return em.createQuery("SELECT e From Conta e").getResultList();
		
	}
	
	// Criteria
	public List<Conta> listarComCriteria(){
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Conta> criteria = builder.createQuery(Conta.class);
		criteria.from(Conta.class);
		return em.createQuery( criteria ).getResultList();
		
	}
}
