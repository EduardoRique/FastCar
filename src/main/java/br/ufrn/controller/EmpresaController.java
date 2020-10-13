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

import br.ufrn.model.Empresa;
import br.ufrn.service.EmpresaService;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
	
	private final EmpresaService empresaService;
	
	@Autowired
	public EmpresaController(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}
	
	@GetMapping("/listall")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Empresa> listAllEmpresa() {
		return empresaService.findAll();
	}
	
	@PostMapping("/add")
	@ResponseStatus(value = HttpStatus.OK)
	public void addEmpresa(@RequestBody Empresa empresa) {
		empresaService.save(empresa);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmpresa(@PathVariable("id") Long id) {
		empresaService.deleteById(id);
	}

	@GetMapping("/findById/{id}")
	public Optional<Empresa> findByIdEmpresa(@PathVariable("id") Long id) {
		return empresaService.findById(id);
	}

}
