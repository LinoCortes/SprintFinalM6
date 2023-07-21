package cl.awakelab.ejerciciogrupal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cl.awakelab.ejerciciogrupal.modelo.Capacitacion;
import cl.awakelab.ejerciciogrupal.modelo.Profesional;
import cl.awakelab.ejerciciogrupal.service.CapacitacionService;
import cl.awakelab.ejerciciogrupal.service.ProfesionalService;


@RestController
public class ApiRestController {
  
      
      @Autowired
      private ProfesionalService profesionalService;
      
      @Autowired
      private CapacitacionService capacitacionService;
      
      
     
     @RequestMapping(value="/api/profesional", headers = "Accept=application/json")
      public List<Profesional> getProfesional() {
        return profesionalService.getAll();
      }
      
      
      @RequestMapping(value="/api/capacitacion", headers = "Accept=application/json" )
      public List<Capacitacion> getCapacitaciones() {
          return capacitacionService.getAll();
      }
      
      @RequestMapping(value="/api/capacitaciones", method = RequestMethod.POST)
      public Capacitacion createCapacitacion(@RequestBody Capacitacion capacitacion) {
        return capacitacionService.save(capacitacion);
      }
      
      @RequestMapping(value="/api/profesional", method = RequestMethod.POST)
      public Profesional createProfesional(@RequestBody Profesional profesional) {
        return profesionalService.create(profesional);
      }
      
      
}