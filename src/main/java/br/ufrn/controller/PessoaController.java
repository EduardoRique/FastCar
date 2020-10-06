package br.ufrn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ufrn.model.Pessoa;
import br.ufrn.repository.PessoaRepository;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	private final PessoaRepository pessoaRepository;
	
	@Autowired
	public PessoaController(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	/**
	 * Lista todas as Colunas de produção salvas no sistema
	 */
	@GetMapping("/listall")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Pessoa> listAllPessoa() {
		return pessoaRepository.findAll();
	}

}
