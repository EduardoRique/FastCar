package br.ufrn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufrn.model.Empresa;
import br.ufrn.repository.EmpresaRepository;

@Service
@Transactional(readOnly = true)
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	public List<Empresa> findAll() {
		return empresaRepository.findAll();
	}
	
	@Transactional(readOnly = false)
	public Empresa save(Empresa entity) {
		return empresaRepository.save(entity);
	}
	
	public Optional<Empresa> findById(Long id) {
		return empresaRepository.findById(id);
	}
	
	@Transactional(readOnly = false)
	public void deleteById(Long id) {
		empresaRepository.deleteById(id);
	}
}
