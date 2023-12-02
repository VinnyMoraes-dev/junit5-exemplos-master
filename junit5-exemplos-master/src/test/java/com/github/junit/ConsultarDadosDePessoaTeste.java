package com.github.junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.junit.BancoDeDados;
import com.github.junit.Pessoa;

public class ConsultarDadosDePessoaTeste {
	
	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexao();
	}
	
	@BeforeEach
	void inseriDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("Vinny", LocalDateTime.of(1987, 8, 27, 11, 10, 0)));
	}
	
	@AfterEach
	void removeDadosDoTeste() {
		BancoDeDados.removeDados(new Pessoa("Vinny", LocalDateTime.of(1987, 8, 27, 11, 10, 0)));
	}
	
	@Test 
	void validarDadosDeRetorno(){
		Assertions.assertTrue(true);
	}
	
	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.finalizarConexao();
	}
}










