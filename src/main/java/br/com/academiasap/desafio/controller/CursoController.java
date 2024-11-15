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
import br.com.academiasap.desafio.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public List<CursoDTO> listarTodos(){
		return cursoService.listarTodos();
	}
	
	@PostMapping
	public void inserir (@RequestBody CursoDTO curso) {
		cursoService.inserir(curso);
	}
	
	@PutMapping
	public CursoDTO alterar (@RequestBody CursoDTO curso) {
		return cursoService.alterar(curso);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		cursoService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
