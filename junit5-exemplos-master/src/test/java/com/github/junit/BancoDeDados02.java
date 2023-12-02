package com.github.junit;

import java.util.logging.Logger;

import com.github.junit.BancoDeDados;
import com.github.junit.Pessoa;

public class BancoDeDados02 {
private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
	
	public static void iniciarConexao() {
		LOGGER.info("Iniciou Conexão");
	}
	
	public void finalizarConexao() {
		LOGGER.info("Finalizou Conexão");
	}
	

	public static void removeDados(Pessoa pessoa) {
		LOGGER.info("Removeu Dados");
	}

	public static void insereDados(Pessoa pessoa) {
		LOGGER.info("Inseriu Dados");
		
	}
}










































