package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Funcionario;
import repository.FuncionarioRepository;

@Service
@Transactional(readOnly = true)
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public List<Funcionario> findAll() {
		return funcionarioRepository.findAll();
	}
	
}