package br.com.willb.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testeIgual() {
	 int a = 3 - 1;
	 assertEquals(2, a);
	}
	@Test
	void testeEquals() {
		int a = 3 - 1 + 10;
		assertEquals(12, a);
	}

}
