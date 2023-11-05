package com.biblioteca.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.model.Livro;
import com.biblioteca.repository.LivroRepository;

@RestController	
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@GetMapping
	public List<Livro> listar() {
		return livroRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Livro adicionar(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}
	
	@DeleteMapping
	public void Deleta(@RequestBody Livro livro) {
		livroRepository.delete(livro);
	}
	
	@PutMapping
	public Livro Atualiza(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}
	
}
