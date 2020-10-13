package br.ufrn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.ufrn.model.Pessoa;
import br.ufrn.model.Servico;

@CrossOrigin("http://localhost:9595")
public interface ServicoRepository extends JpaRepository<Servico, Long> {
	
	
}
