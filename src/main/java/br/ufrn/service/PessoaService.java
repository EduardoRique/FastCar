package br.ufrn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufrn.model.Pessoa;
import br.ufrn.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}
	
	public Optional<Pessoa> findOne(Long id) {
		return pessoaRepository.findById(id);
	}
	
	@Transactional(readOnly = false)
	public Pessoa save(Pessoa entity) {
		return pessoaRepository.save(entity);
	}

	@Transactional(readOnly = false)
	public void delete(Pessoa entity) {
		pessoaRepository.delete(entity);
	}

}
	
