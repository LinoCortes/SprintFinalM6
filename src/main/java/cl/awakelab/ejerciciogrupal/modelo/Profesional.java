package cl.awakelab.ejerciciogrupal.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profesional")
public class Profesional implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id_profesional;
	private String nombre;
	private String run;
	private String fechaNacimiento;
	private String titulo;
	private String fechaIngreso;

	public Profesional(int id_profesional ,String nombre, String run, String fechaNacimiento,
			String titulo, String fechaIngreso) {
		this.id_profesional=id_profesional;
		this.nombre = nombre;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	

	

	public int getId_profesional() {
		return id_profesional;
	}




	public void setId_profesional(int id_profesional) {
		this.id_profesional = id_profesional;
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRun() {
		return run;
	}


	public void setRun(String run) {
		this.run = run;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Profesional() {
		
	}


	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return super.toString() + " Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
}