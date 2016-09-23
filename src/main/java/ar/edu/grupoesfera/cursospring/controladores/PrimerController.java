package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PrimerController {
		
	@RequestMapping("/CrearPartido")
	public ModelAndView crearPartido(){
		
		return new ModelAndView("CrearPartido");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView verPartidos(@RequestParam("txtNombre") String nombre){
		ModelMap modelo = new ModelMap();
		modelo.put("nombrePartido", nombre);
		return new ModelAndView("CrearPartido", modelo);
	}	
	
}
