package dev.console;
import dev.exception.CalculException;
import dev.service.CalculService;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
	
	private Scanner scanner;
	private CalculService calculatrice;
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public App(Scanner scanner, CalculService calculatrice) {
		
		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}
	
	protected void afficherTitre() {
		System.out.println("**** Application Calculatrice ****");
	}
	
	public void demarrer() {
		afficherTitre();
	}
	
	protected void evaluer(String expression) {
		try{
		int somme = calculatrice.additionner(expression);
		System.out.println("expression" + "=" + somme);
		} catch (CalculException e) {
			System.out.println("L'expression " + expression + " est invalide.");
		}
		
	}
}