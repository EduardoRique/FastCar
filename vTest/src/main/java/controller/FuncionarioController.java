package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Funcionario;
import service.FuncionarioService;

@Controller
@RequestMapping("/employee")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@GetMapping
	public String index(Model model) {
		List<Funcionario> all = funcionarioService.findAll();
		model.addAttribute("listModule", all);
		return "module/index";
	}
}
