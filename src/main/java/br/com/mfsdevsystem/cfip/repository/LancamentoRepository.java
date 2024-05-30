package br.com.mfsdevsystem.cfip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mfsdevsystem.cfip.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Integer>{

}
