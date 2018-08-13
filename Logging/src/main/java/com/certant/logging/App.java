package com.certant.logging;

import java.text.ParseException;

import org.apache.log4j.Logger;

public class App {
	private static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) throws ParseException {
		logger.error("Esto es un error");
		logger.debug("Esto es un debug");
		logger.info("Esto es un info");
		logger.warn("Esto es un warn");
		logger.fatal("Esto es un fatal");
//		UsuarioService usuarioService = new UsuarioService();
//		usuarioService.crearUsuario("Rodriguez Barinagarrementeria ", "Liliana Jacqueline", "Password01", "20-37457445-3", "12/24/2010");
	}
}
