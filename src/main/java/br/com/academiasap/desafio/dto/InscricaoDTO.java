package br.com.academiasap.desafio.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import br.com.academiasap.desafio.entity.InscricaoEntity;


public class InscricaoDTO {

	private Long id;
	private Date dataIsncricao;
	
	public InscricaoDTO(InscricaoEntity inscricao) {
		BeanUtils.copyProperties(inscricao, this);
	}
	public InscricaoDTO() {
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
	
	
}
