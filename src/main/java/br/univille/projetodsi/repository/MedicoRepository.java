package br.univille.projetodsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetodsi.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
