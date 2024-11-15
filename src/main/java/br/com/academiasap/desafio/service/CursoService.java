package br.com.academiasap.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academiasap.desafio.dto.CursoDTO;
import br.com.academiasap.desafio.entity.CursoEntity;
import br.com.academiasap.desafio.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	public List<CursoDTO> listarTodos(){
		List<CursoEntity> curso = cursoRepository.findAll();
		return curso.stream().map(CursoDTO::new).toList();
	}
	
	public void inserir(CursoDTO curso) {
		CursoEntity cursoEntity = new CursoEntity(curso);
		cursoRepository.save(cursoEntity);
	}
	
	public CursoDTO alterar(CursoDTO curso) {
		CursoEntity cursoEntity = new CursoEntity(curso);
		return new CursoDTO(cursoRepository.save(cursoEntity));
	}
	
	public void excluir (Long id){
		CursoEntity curso = cursoRepository.findById(id).get();
		cursoRepository.delete(curso);
	}
	
	public CursoDTO buscarPorId (Long id){
		return new CursoDTO(cursoRepository.findById(id).get());
	}
}
