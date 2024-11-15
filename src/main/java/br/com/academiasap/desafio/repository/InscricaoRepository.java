package br.com.academiasap.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.academiasap.desafio.entity.InscricaoEntity;

public interface InscricaoRepository extends JpaRepository<InscricaoEntity, Long> {

	
}
