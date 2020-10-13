package br.ufrn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufrn.model.Pessoa;
import br.ufrn.model.Servico;
import br.ufrn.repository.ServicoRepository;

@Service
@Transactional(readOnly = true)
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;
	
	@Transactional(readOnly = false)
	public Servico save(Servico servico) {
		return servicoRepository.save(servico);
	}
	
	public List<Servico> findAll() {
		return servicoRepository.findAll();
	}
	
	
}
