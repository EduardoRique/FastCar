package br.ufrn.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.ufrn.model.Pessoa;
import br.ufrn.model.Veiculo;

@CrossOrigin("http://localhost:9595")
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
	
	List<Veiculo> findByPessoa(Pessoa pessoa);
}
