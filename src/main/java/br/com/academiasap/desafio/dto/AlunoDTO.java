package br.com.academiasap.desafio.dto;

import java.util.Date;
import org.springframework.beans.BeanUtils;
import br.com.academiasap.desafio.entity.AlunoEntity;


public class AlunoDTO {
	
	private Long id;
	private String nome;
	private String email;
	private Date dataCadastro;
	
	
	
	public AlunoDTO(AlunoEntity aluno) {
		BeanUtils.copyProperties(aluno, this);
	}
	public AlunoDTO() {
		
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}
