package com.certant.logging;

import java.text.ParseException;

import com.certant.logging.services.UsuarioService;

public class App {

	public static void main(String[] args) throws ParseException {
		UsuarioService usuarioService = new UsuarioService();
		usuarioService.crearUsuario("Rodriguez Barinagarrementeria", "Liliana Jacqueline", "Password01", "20374574453", null);
	}
}
