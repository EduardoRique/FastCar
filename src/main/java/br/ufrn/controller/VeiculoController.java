package br.ufrn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ufrn.model.Pessoa;
import br.ufrn.model.Servico;
import br.ufrn.model.Veiculo;
import br.ufrn.repository.ServicoRepository;
import br.ufrn.service.PessoaService;
import br.ufrn.service.VeiculoService;

@RestController
@RequestMapping("/api/veiculo")
public class VeiculoController {

private final VeiculoService veiculoService;
	
	@Autowired
	public VeiculoController(VeiculoService veiculoService) {
		this.veiculoService = veiculoService;
	}
	
	@GetMapping("/listall")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Veiculo> listAllVeiculos() {
		return veiculoService.findAll();
	}
	
	@PostMapping("/add")
	@ResponseStatus(value = HttpStatus.OK)
	public void addVeiculo(@RequestBody Veiculo veiculo) {
		veiculoService.save(veiculo);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteVeiculo(@PathVariable("id") Long id) {
		veiculoService.deleteById(id);
	}

}
