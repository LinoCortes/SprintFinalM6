package cl.awakelab.ejerciciogrupal.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administrativo")
public class Administrativo {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_administrativo")
	int id;
	String nombre;
	String run;
	String fechaNacimiento;
	String area;
	@Column(name="exp_previa")
	String experienciaPrevia;
	
	public Administrativo(int id, String nombre, String run, String fechaNacimiento, String area,
			String experienciaPrevia) {
		this.id = id;
		this.nombre = nombre;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	
	public Administrativo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [id=" + id + ", nombre=" + nombre + ", run=" + run + ", fechaNacimiento="
				+ fechaNacimiento + ", area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}

	
}