package cl.awakelab.ejerciciogrupal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.ejerciciogrupal.service.CapacitacionService;



@Controller
public class CapacitacionController {

	@Autowired
	CapacitacionService capacitacionService;
	
    @RequestMapping(path = "/listar-capacitaciones", method = RequestMethod.GET)
    public ModelAndView mostrarListarCapacitaciones() {
    	System.out.println("Prueba dentro del controlador de capacitaciones");
    	return new ModelAndView("listar-capacitaciones", "capacitaciones", capacitacionService.getAll());
    }
}