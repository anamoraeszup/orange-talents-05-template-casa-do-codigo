package br.com.zupacademy.casadocodigo.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.zupacademy.casadocodigo.model.Autor;

public interface AutorRepository extends CrudRepository<Autor, Long> {

}