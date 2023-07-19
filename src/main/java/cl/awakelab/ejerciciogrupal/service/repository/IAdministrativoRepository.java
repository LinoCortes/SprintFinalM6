package cl.awakelab.ejerciciogrupal.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.ejerciciogrupal.modelo.Administrativo;

public interface IAdministrativoRepository extends JpaRepository<Administrativo, Integer>{

}