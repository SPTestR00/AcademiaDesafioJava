package br.com.academiasap.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.academiasap.desafio.entity.CursoEntity;

public interface CursoRepository extends JpaRepository<CursoEntity, Long>{

}
