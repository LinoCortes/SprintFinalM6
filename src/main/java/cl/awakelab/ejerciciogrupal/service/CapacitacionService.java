package cl.awakelab.ejerciciogrupal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.ejerciciogrupal.modelo.Capacitacion;
import cl.awakelab.ejerciciogrupal.service.repository.ICapacitacionRepository;

@Service
public class CapacitacionService {
	
	@Autowired
	private ICapacitacionRepository iCapacitacionRepository;
	
	public CapacitacionService() {
		
	}
	
	public List<Capacitacion> getAll(){
		return iCapacitacionRepository.findAll();
	}
	
	public Capacitacion save(Capacitacion capacitacion){
		return iCapacitacionRepository.save(capacitacion);
	}
	
}
