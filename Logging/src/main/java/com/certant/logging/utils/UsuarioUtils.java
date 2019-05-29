package com.certant.logging.utils;

import java.text.SimpleDateFormat;

import org.apache.commons.lang.StringUtils;

public class UsuarioUtils {

	public static SimpleDateFormat getDateFormatter(){
		return new SimpleDateFormat("dd/MM/yyyy");
	}

	public static String hidePassword(String password){
		return StringUtils.repeat("*", password.length());
	}
}
