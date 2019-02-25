package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;

public class CalculService {
	
	private static final Logger LOG = LoggerFactory.getLogger(CalculService.class);
	
	public int additionner(String expression) {
		
		LOG.debug("Evaluation de l'expression {}", expression);
		String[] parts = expression.split("\\+");
		int somme = 0;
		for(String part:parts){
			try{
			somme = somme + Integer.parseInt(part);
			} catch (NumberFormatException e){
				throw new CalculException();
			}
		}
		return somme;
	}
}


