package com.certant.logging.models;

import java.util.Date;

public class Usuario {
	private String apellido;
	private String nombre;
	private String password;
	private Long   cuil;
	private Date   fechaNacimiento;

	public Usuario(String apellido, String nombre, String password, Long cuil, Date fechaNacimiento) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.password = password;
		this.cuil = cuil;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}

	public Long getCuil() {
		return cuil;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

}
