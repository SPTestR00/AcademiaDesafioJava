package br.com.academiasap.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academiasap.desafio.dto.CursoDTO;
import br.com.academiasap.desafio.dto.InscricaoDTO;
import br.com.academiasap.desafio.service.AlunoService;
import br.com.academiasap.desafio.service.CursoService;
import br.com.academiasap.desafio.service.InscricaoService;

@RestController
@RequestMapping("/inscricao")
public class InscricaoController {

	
	@Autowired
	private AlunoService alunoService;
	
	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private InscricaoService inscricaoService;
	
	
	@GetMapping
	public List<InscricaoDTO> listarTodos(){
		return inscricaoService.listarTodos();
	}
	
	@PostMapping
	public void inserir (@RequestBody InscricaoDTO inscricao) {
		inscricaoService.inserir(inscricao);
	}
	
	@PutMapping
	public InscricaoDTO alterar (@RequestBody InscricaoDTO inscricao) {
		return inscricaoService.alterar(inscricao);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		inscricaoService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
