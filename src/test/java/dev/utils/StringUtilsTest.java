package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance(){

		String lhs;
		String rhs;

		//Aucune opération
		lhs = "chat";
		rhs = "chat";
		assertEquals(0, StringUtils.levenshteinDistance(lhs, rhs));

		//Test de l'ajout d'un seul caractère		
		lhs = "chat";
		rhs = "chats";
		assertEquals(1, StringUtils.levenshteinDistance(lhs, rhs));

		//Test du remplacement d'un caractère
		lhs = "machins";
		rhs = "machine";
		assertEquals(1, StringUtils.levenshteinDistance(lhs, rhs));

		//Test du retirage d'un caractère
		lhs = "aviron";
		rhs = "avion";
		assertEquals(1, StringUtils.levenshteinDistance(lhs, rhs));

		//Deux opérations
		lhs = "distance";
		rhs = "instance";
		assertEquals(2, StringUtils.levenshteinDistance(lhs, rhs));

		//Un vide
		lhs = "";
		rhs = "machins";
		assertEquals(7, StringUtils.levenshteinDistance(lhs, rhs));

		//Un null
		lhs = null;
		rhs = "machins";
		assertEquals(7, StringUtils.levenshteinDistance(lhs, rhs));

		//Deux null
		lhs = null;
		rhs = null;
		assertEquals(0, StringUtils.levenshteinDistance(lhs, rhs));
	}

}
