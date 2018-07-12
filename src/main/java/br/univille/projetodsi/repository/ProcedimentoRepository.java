package br.univille.projetodsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetodsi.model.Procedimento;

@Repository
public interface ProcedimentoRepository extends JpaRepository< Procedimento, Long>{

}
