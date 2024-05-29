package ar.edu.unju.fi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.Materia;
import ch.qos.logback.core.model.Model;

@Controller
public class MainController {
	
	private List<Materia> materias;
	
	@GetMapping("/listado")
	public String geteListadoMaterias(Model model) {
		
		return "index";
	}

}
