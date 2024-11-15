package br.com.academiasap.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.academiasap.desafio.entity.AlunoEntity;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long>{

}
