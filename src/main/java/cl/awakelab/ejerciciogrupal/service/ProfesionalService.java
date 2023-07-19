package cl.awakelab.ejerciciogrupal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cl.awakelab.ejerciciogrupal.modelo.Profesional;
import cl.awakelab.ejerciciogrupal.service.repository.IProfesionalRepository;

@Service
public class ProfesionalService {
	
	@Autowired
	private IProfesionalRepository iProfesionalRepository;
	
	public ProfesionalService() {
		
	}
	
	public List<Profesional> getAll(){
		return iProfesionalRepository.findAll();
	}
}