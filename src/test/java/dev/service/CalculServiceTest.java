package dev.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.*;

import dev.exception.CalculException;


/**
* Test unitaire de la classe dev.service.CalculService.
*/

public class CalculServiceTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdditionner() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService"); 
		CalculService calculService = new CalculService();
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		int somme = calculService.additionner("1+3+4");
		LOG.info("Alors j'obtiens le résultat 8");
		assertThat(somme).isEqualTo(8);
	}
	
	@Test
	public void testAdditionnerException() {
		LOG.info("Etant donné, une instance de la classe CalculService"); 
		CalculService calculService = new CalculService();
		LOG.info("Lorsque j'évalue l'addition de l'expression invalide 1*a*4");		
		LOG.info("Alors j'obtiens une CalculException.");
		assertThatThrownBy(() -> { calculService.additionner("1*a*4"); }).isInstanceOf(CalculException.class);
	}

}
