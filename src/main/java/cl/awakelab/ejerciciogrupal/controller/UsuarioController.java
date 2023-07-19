package cl.awakelab.ejerciciogrupal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.ejerciciogrupal.service.AdministrativoService;
import cl.awakelab.ejerciciogrupal.service.ClienteService;
import cl.awakelab.ejerciciogrupal.service.ProfesionalService;

@Controller
public class UsuarioController {

	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	ProfesionalService profesionalService;
	
	@Autowired
	AdministrativoService administrativoService;
	
	//@Autowired
	//AdministrativoService administrativoService;
	
	@RequestMapping(path = "/listar-usuarios", method = RequestMethod.GET)
    public ModelAndView mostrarListarUsuarios() {
		ModelAndView model = new ModelAndView("listar-usuarios");
		model.addObject("administrativos",administrativoService.getAll());
		model.addObject("profesionales", profesionalService.getAll());
		model.addObject("clientes",clienteService.getAll());
		return model;
		
	}
}
