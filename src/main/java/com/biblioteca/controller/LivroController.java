package com.biblioteca.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        public ResponseEntity<?> Atualiza(@RequestBody Livro livro) {
        try {
            Livro livroAtualizado = livroRepository.save(livro);
            return ResponseEntity.ok(livroAtualizado); 
        } catch (Exception e) {
            String mensagemErro = "Erro ao atualizar: Forneça o ID, nome e o novo gênero para atualizar o livro.";
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagemErro);
        }
    }
 }
