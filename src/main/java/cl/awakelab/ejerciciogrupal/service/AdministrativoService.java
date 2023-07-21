package cl.awakelab.ejerciciogrupal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.ejerciciogrupal.modelo.Administrativo;
import cl.awakelab.ejerciciogrupal.modelo.Profesional;
import cl.awakelab.ejerciciogrupal.service.repository.IAdministrativoRepository;

@Service
public class AdministrativoService {
	@Autowired
	private IAdministrativoRepository iAdministrativoRepository;
	
	public AdministrativoService() {
		
	}
	
	public List<Administrativo> getAll(){
		return iAdministrativoRepository.findAll();
	}
	
	public Administrativo create(Administrativo administrativo) {
		return iAdministrativoRepository.save(administrativo);
	}
}
