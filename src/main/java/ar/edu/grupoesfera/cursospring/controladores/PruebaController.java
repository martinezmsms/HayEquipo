package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Persona;

@Controller 
public class PruebaController {
	
	@RequestMapping("/saludo")
	public ModelAndView crearPersona(@ModelAttribute Persona persona){			
		
		return new ModelAndView("PruebaVista");	
	}
}
