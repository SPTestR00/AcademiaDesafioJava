package br.com.academiasap.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academiasap.desafio.dto.CursoDTO;
import br.com.academiasap.desafio.dto.InscricaoDTO;
import br.com.academiasap.desafio.entity.CursoEntity;
import br.com.academiasap.desafio.entity.InscricaoEntity;
import br.com.academiasap.desafio.repository.AlunoRepository;
import br.com.academiasap.desafio.repository.CursoRepository;
import br.com.academiasap.desafio.repository.InscricaoRepository;

@Service
public class InscricaoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private InscricaoRepository inscricaoRepository;
	
	
	
	public List<InscricaoDTO> listarTodos(){
		List<InscricaoEntity> inscricao = inscricaoRepository.findAll();
		return inscricao.stream().map(InscricaoDTO::new).toList();
	}
	
	public void inserir(InscricaoDTO inscricao) {
		InscricaoEntity inscricaoEntity = new InscricaoEntity(inscricao);
		inscricaoRepository.save(inscricaoEntity);
	}
	
	public InscricaoDTO alterar(InscricaoDTO inscricao) {
		InscricaoEntity inscricaoEntity = new InscricaoEntity(inscricao);
		return new InscricaoDTO(inscricaoRepository.save(inscricaoEntity));
	}
	
	public void excluir (Long id){
		InscricaoEntity inscricao = inscricaoRepository.findById(id).get();
		inscricaoRepository.delete(inscricao);
	}
	
	public InscricaoDTO buscarPorId (Long id){
		return new InscricaoDTO(inscricaoRepository.findById(id).get());
	}
}
