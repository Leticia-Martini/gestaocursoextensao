package br.univille.microservcolegio.secretaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservcolegio.secretaria.entity.Aluno;

@Repository
public interface AlunoRepository
    extends CrudRepository<Aluno,String> {
    
}
