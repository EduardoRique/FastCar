package br.ufrn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufrn.model.Empresa;
import br.ufrn.repository.EmpresaRepository;
import validation.ValidaEmpresa;
import validation.ValidaPessoa;

@Service
@Transactional(readOnly = true)
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	private ValidaEmpresa validaEmpresa;
	
	public EmpresaService() {
		validaEmpresa = new ValidaEmpresa();
	}

	public List<Empresa> findAll() {
		return empresaRepository.findAll();
	}
	
	@Transactional(readOnly = false)
	public Empresa save(Empresa entity) {
		
		if(!validaEmpresa.isCNPJ(entity.getCnpj())) {
			throw new IllegalArgumentException("CNPJ inválido");
		}
		else {
			return empresaRepository.save(entity);
		}
	}
	
	public Optional<Empresa> findById(Long id) {
		return empresaRepository.findById(id);
	}
	
	@Transactional(readOnly = false)
	public void deleteById(Long id) {
		empresaRepository.deleteById(id);
	}
}
