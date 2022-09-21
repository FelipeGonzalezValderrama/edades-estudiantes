package talentoDigital.main;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Estudiante {

	private Integer id;
	private String rut;
	private String apellidoPat;
	private String apellidoMat;
	private String direccion;
	private String fechaNacimiento;

	public Estudiante(Integer id, String rut, String apellidoPat, String apellidoMat, String direccion,
			String fechaNacimiento) {
		this.id = id;
		this.rut = rut;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer calcularEdad(String fecha) {
		String[] fechaDMA = fecha.split("/");
		LocalDate inicial = LocalDate.of(Integer.parseInt(fechaDMA[2]), Integer.parseInt(fechaDMA[1]),
				Integer.parseInt(fechaDMA[0]));
		LocalDate actual = LocalDate.now();
		Integer cantidadAnio = (int) java.time.temporal.ChronoUnit.YEARS.between(inicial, actual);
		return cantidadAnio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", rut=" + rut + ", apellidoPat=" + apellidoPat + ", apellidoMat=" + apellidoMat
				+ ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
