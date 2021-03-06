package br.ufrn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.ufrn.model.Funcionario;

@CrossOrigin("http://localhost:9595")
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
