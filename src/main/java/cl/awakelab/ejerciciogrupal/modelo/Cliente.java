package cl.awakelab.ejerciciogrupal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@Column(name="id_cliente")
	int id;
	String nombre, run;
	String fechaNacimiento;
	private int edad;
	private String apellidos, rut, telefono, afp, direccion, comuna;
	
	public Cliente(int id, String nombre, String run, String fechaNacimiento, int edad, String apellidos, String rut,
			String telefono, String afp, String direccion, String comuna) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.apellidos = apellidos;
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	public Cliente() {
	
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", run=" + run + ", fechaNacimiento=" + fechaNacimiento
				+ ", edad=" + edad + ", apellidos=" + apellidos + ", rut=" + rut + ", telefono=" + telefono + ", afp="
				+ afp + ", direccion=" + direccion + ", comuna=" + comuna + "]";
	}
	
}