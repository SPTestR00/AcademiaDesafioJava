package br.com.academiasap.desafio.entity;

import java.util.Date;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.academiasap.desafio.dto.InscricaoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_INSCRICAO")
public class InscricaoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date dataIsncricao;
	
	
	public InscricaoEntity(InscricaoDTO inscricao) {
		BeanUtils.copyProperties(inscricao, this);
	}
	public InscricaoEntity() {
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataIsncricao() {
		return dataIsncricao;
	}

	public void setDataIsncricao(Date dataIsncricao) {
		this.dataIsncricao = dataIsncricao;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InscricaoEntity other = (InscricaoEntity) obj;
		return Objects.equals(id, other.id);
	}
}
