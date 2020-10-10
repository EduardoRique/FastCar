package br.ufrn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufrn.model.Pessoa;
import br.ufrn.model.Servico;
import br.ufrn.model.Veiculo;
import br.ufrn.repository.ServicoRepository;
import br.ufrn.repository.VeiculoRepository;

@Service
@Transactional(readOnly = true)
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	public List<Veiculo> findAll() {
		return veiculoRepository.findAll();
	}
	
	@Transactional(readOnly = false)
	public Veiculo save(Veiculo entity) {
		return veiculoRepository.save(entity);
	}
	
	@Transactional(readOnly = false)
	public void deleteById(Long id) {
		veiculoRepository.deleteById(id);
	}

}
