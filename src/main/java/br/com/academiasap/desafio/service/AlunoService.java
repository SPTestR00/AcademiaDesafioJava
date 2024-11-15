package br.com.academiasap.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academiasap.desafio.dto.AlunoDTO;
import br.com.academiasap.desafio.entity.AlunoEntity;
import br.com.academiasap.desafio.repository.AlunoRepository;


@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<AlunoDTO> listarTodos(){
		List<AlunoEntity> aluno = alunoRepository.findAll();
		return aluno.stream().map(AlunoDTO::new).toList();
	}
	
	public void inserir(AlunoDTO aluno) {
		AlunoEntity alunoEntity = new AlunoEntity(aluno);
		alunoRepository.save(alunoEntity);
	}
	
	public AlunoDTO alterar(AlunoDTO aluno) {
		AlunoEntity alunoEntity = new AlunoEntity(aluno);
		return new AlunoDTO(alunoRepository.save(alunoEntity));
	}
	
	public void excluir (Long id){
		AlunoEntity aluno = alunoRepository.findById(id).get();
		alunoRepository.delete(aluno);
	}
	
	public AlunoDTO buscarPorId (Long id){
		return new AlunoDTO(alunoRepository.findById(id).get());
	}
	
}
