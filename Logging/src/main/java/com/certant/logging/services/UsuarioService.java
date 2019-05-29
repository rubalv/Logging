package com.certant.logging.services;

import java.text.ParseException;
import java.util.Date;

import com.certant.logging.models.Usuario;
import com.certant.logging.utils.UsuarioUtils;

public class UsuarioService {
	// private static final Logger logger = Logger.getLogger(UsuarioService.class);

	public Usuario crearUsuario(String apellido, String nombre, String password, String cuil, String fechaNacimiento) throws ParseException {
		Date formatedDate = UsuarioUtils.getDateFormatter().parse(fechaNacimiento);
		Long formatedCuil = Long.parseLong(cuil);
		Usuario usuario = new Usuario(apellido, nombre, password, formatedCuil, formatedDate);
		return usuario;
	}

}
