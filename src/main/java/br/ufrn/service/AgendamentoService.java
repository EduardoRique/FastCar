package br.ufrn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufrn.model.Agendamento;
import br.ufrn.model.Empresa;
import br.ufrn.model.Veiculo;
import br.ufrn.repository.AgendamentoRepository;

@Service
@Transactional(readOnly = true)
public class AgendamentoService {
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;

	public List<Agendamento> findAll() {
		return agendamentoRepository.findAll();
	}
	
	@Transactional(readOnly = false)
	public Optional<Agendamento> finishAgendamento(Long id){
		Optional<Agendamento> agendamento_optional = this.findById(id);
		if(!agendamento_optional.isEmpty()) {
			Agendamento agendamento = agendamento_optional.get();
			agendamento.setStatus("Finalizado");
			this.save(agendamento);
		}
		return agendamento_optional;
	}
	
	@Transactional(readOnly = false)
	public Agendamento save(Agendamento entity) {
		return agendamentoRepository.save(entity);
	}
	
	public Optional<Agendamento> findById(Long id) {
		return agendamentoRepository.findById(id);
	}
	
	@Transactional(readOnly = false)
	public void deleteById(Long id) {
		agendamentoRepository.deleteById(id);
	}

	public List<Agendamento> findByVeiculo(Veiculo veiculo) {
		return agendamentoRepository.findByVeiculo(veiculo);
	}
	
}
