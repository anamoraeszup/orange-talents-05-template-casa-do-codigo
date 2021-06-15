package br.com.zupacademy.casadocodigo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.zupacademy.casadocodigo.form.NovoAutorForm;
import br.com.zupacademy.casadocodigo.model.Autor;
import br.com.zupacademy.casadocodigo.repository.AutorRepository;

@RestController
public class AutorController {

	@Autowired
	private AutorRepository autorRepository;

	@PostMapping(value = "/autores")
	@ResponseBody
	public ResponseEntity<?> criaAutores(@RequestBody @Validated NovoAutorForm autorForm) {
		Autor autor = autorForm.toModel();
		autorRepository.save(autor);
		return ResponseEntity.ok(autor.toString());
	}
}