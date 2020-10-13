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

import br.ufrn.model.Agendamento;
import br.ufrn.model.Veiculo;
import br.ufrn.service.AgendamentoService;

@RestController
@RequestMapping("/api/agendamento")
public class AgendamentoController {

private final AgendamentoService agendamentoService;
	
	@Autowired
	public AgendamentoController(AgendamentoService agendamentoService) {
		this.agendamentoService = agendamentoService;
	}
	
	@GetMapping("/listall")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Agendamento> listAllAgendamento() {
		return agendamentoService.findAll();
	}
	
	@PostMapping("/add")
	@ResponseStatus(value = HttpStatus.OK)
	public void addAgendamento(@RequestBody Agendamento agendamento) {
		agendamentoService.save(agendamento);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteAgendamento(@PathVariable("id") Long id) {
		agendamentoService.deleteById(id);
	}

	@GetMapping("/findById/{id}")
	public Optional<Agendamento> findByIdAgendamento(@PathVariable("id") Long id) {
		return agendamentoService.findById(id);
	}

	@GetMapping("/findByVeiculo")
	public List<Agendamento> findByVeiculo(Veiculo veiculo) {
		return agendamentoService.findByVeiculo(veiculo);
	}
}
