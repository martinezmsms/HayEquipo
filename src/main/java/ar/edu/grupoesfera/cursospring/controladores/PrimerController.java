package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimerController {

	@RequestMapping("/HolaMundo")
	public ModelAndView inicio(){
		 return new ModelAndView("HolaMundo");
	}
	
}
