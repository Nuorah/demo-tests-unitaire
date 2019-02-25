package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculService {
	
	private static final Logger LOG = LoggerFactory.getLogger(CalculService.class);
	
	public int additionner(String expression) {
		// TODO Ajouter un log en niveau DEBUG affichant "Evaluation de l'expression <expression>".
		// TODO par exemple "Evaluation de l'expression 1+4"
		LOG.debug("Evaluation de l'expression {}", expression);
		return 0;
	}
}


