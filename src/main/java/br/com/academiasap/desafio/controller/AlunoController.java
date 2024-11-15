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

import br.com.academiasap.desafio.dto.AlunoDTO;
import br.com.academiasap.desafio.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<AlunoDTO> listarTodos(){
		return alunoService.listarTodos();
	}
	
	@PostMapping
	public void inserir (@RequestBody AlunoDTO aluno) {
		alunoService.inserir(aluno);
	}
	
	@PutMapping
	public AlunoDTO alterar (@RequestBody AlunoDTO aluno) {
		return alunoService.alterar(aluno);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		alunoService.excluir(id);
		return ResponseEntity.ok().build();
	}

}
