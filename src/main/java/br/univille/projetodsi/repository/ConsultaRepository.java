package br.univille.projetodsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetodsi.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository< Consulta, Long>{

}
