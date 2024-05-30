package br.com.mfsdevsystem.cfip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mfsdevsystem.cfip.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Integer>{

}
