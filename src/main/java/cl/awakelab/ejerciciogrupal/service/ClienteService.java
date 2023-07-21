package cl.awakelab.ejerciciogrupal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.ejerciciogrupal.modelo.Cliente;
import cl.awakelab.ejerciciogrupal.modelo.Profesional;
import cl.awakelab.ejerciciogrupal.service.repository.IClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private IClienteRepository iClienteRepository;
	
	public ClienteService() {
		
	}
	
	public List<Cliente> getAll(){
		return iClienteRepository.findAll();
	}
	
	public Cliente create(Cliente cliente) {
		return iClienteRepository.save(cliente);
	}
}
