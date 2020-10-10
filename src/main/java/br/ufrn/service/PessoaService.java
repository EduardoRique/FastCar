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
	
	public Optional<Pessoa> findById(Long id) {
		return pessoaRepository.findById(id);
	}
	
	public Optional<Pessoa> findByEmailAndSenha(String email, String senha) {
		return pessoaRepository.findByEmailAndSenha(email, senha);
	}
	
	@Transactional(readOnly = false)
	public Pessoa save(Pessoa entity) {
		if(entity.getCpf().equals("000")) {
			return pessoaRepository.save(entity);
		}
		else {
			entity.setCpf("001");
			return pessoaRepository.save(entity);
		}
		
	}

	@Transactional(readOnly = false)
	public void delete(Pessoa entity) {
		pessoaRepository.delete(entity);
	}
	
	@Transactional(readOnly = false)
	public void deleteById(Long id) {
		pessoaRepository.deleteById(id);
	}

}
	
