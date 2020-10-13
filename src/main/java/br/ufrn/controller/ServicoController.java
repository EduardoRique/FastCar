package br.ufrn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ufrn.model.Pessoa;
import br.ufrn.model.Servico;
import br.ufrn.service.ServicoService;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {

private final ServicoService servicoService;
	
	@Autowired
	public ServicoController(ServicoService servicoService) {
		this.servicoService = servicoService;
	}
	
	@GetMapping("/listall")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Servico> listAllServicos() {
		return servicoService.findAll();
	}
	
	@PostMapping("/add")
	@ResponseStatus(value = HttpStatus.OK)
	public void addServico(@RequestBody Servico servico) {
		servicoService.save(servico);
	}
	
	
}
