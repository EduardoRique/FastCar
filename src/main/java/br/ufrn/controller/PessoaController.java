package br.ufrn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ufrn.model.Pessoa;
import br.ufrn.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	private final PessoaService pessoaService;
	
	@Autowired
	public PessoaController(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}
	
	@GetMapping("/listall")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Pessoa> listAllPessoa() {
		return pessoaService.findAll();
	}
	
	@PostMapping("/add")
	@ResponseStatus(value = HttpStatus.OK)
	public void addPessoa(@RequestBody Pessoa pessoa) {
		pessoaService.save(pessoa);
	}

	@DeleteMapping("/delete/{id}")
	public void deletePessoa(@PathVariable("id") Long id) {
		pessoaService.deleteById(id);
	}

	@GetMapping("/findById/{id}")
	public Optional<Pessoa> findByIdPessoa(@PathVariable("id") Long id) {
		return pessoaService.findById(id);
	}

}
