package com.certant.logging.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.certant.logging.models.Usuario;

public class UsuarioService {
//	private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat dateFormatter = null;

	public Usuario crearUsuario(String apellido, String nombre, String password, String cuil, String fechaNacimiento) throws ParseException {
		Date formatedDate = dateFormatter.parse(fechaNacimiento);
		Long formatedCuil = Long.parseLong(cuil);
		return new Usuario(apellido, nombre, password, formatedCuil, formatedDate);
	}

}
