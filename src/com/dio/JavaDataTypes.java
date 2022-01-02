package com.dio;

public class JavaDataTypes {

	public static void main(String[] args) {
		
		byte maioridade = 18;
		byte centena = 100;
		
		short salarioAnual = 31000;
		short salarioAnualDolar = 5564;
	
		int patrimonioDesejado = 10000000;
		int salarioNeymar = 3300000;
		
		long populacaoBrasil = 212600000L;
		long populacaoIndia = 1380000000L;
		
		float populacaoMundial = 7917561430f;
		float patrimonioBillGates = 735000000000f;		
		
		double temperaturaMediaPoloNorte = -40.0;
		double temperaturaMediaPoloSul = -49.3;
		
		char primeiraLetra = 'A';
		char caractereAleatorio = '\u0016';
		
		String livroFamoso = "Harry Potter";
		String inicioFrase = "Eu amo ";
		
		boolean lobo = false;
		boolean ovelha = true;
		
		System.out.println("A maioridade penal atual no Brasil � " + maioridade);
		System.out.println("Uma centena cont�m " + centena + " unidades");
		System.out.println("Seria interessante receber um sal�rio anual de " + salarioAnual + " reais");
		System.out.println("Esse sal�rio de " + salarioAnualDolar + " d�lares n�o vale muito nos EUA");
		System.out.println("Minha meta de patrim�nio � " + patrimonioDesejado + " reais");
		System.out.println("O sal�rio mensal do menino Ney � " + salarioNeymar + " reais");
		System.out.println("A popula��o brasileira � cerca de " + populacaoBrasil);
		System.out.println("A popula��o da �ndia � cerca de " + populacaoIndia);
		System.out.println("O mundo possui cerca de " + populacaoMundial + " pessoas");
		System.out.println("O patrim�nio do Bill Gates � cerca de " + patrimonioBillGates + " reais");
		System.out.println("No inverno, a temperatura m�dia do Polo Norte � " + temperaturaMediaPoloNorte + 
				"�C. J� no Polo Sul, " + temperaturaMediaPoloSul + "�C");
		System.out.println("Primeira letra do alfabeto: " + primeiraLetra);
		System.out.println("Um caractere aleat�rio: " + caractereAleatorio);
		System.out.println("Frase: " + inicioFrase + livroFamoso);
		System.out.println("Lobo � " + lobo + " e ovelha � " + ovelha);
		
	}

}
