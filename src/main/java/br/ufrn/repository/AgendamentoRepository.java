package br.ufrn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.ufrn.model.Agendamento;
import br.ufrn.model.Veiculo;

@CrossOrigin("http://localhost:9595")
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

	List<Agendamento> findByVeiculo(Veiculo veiculo);
}
