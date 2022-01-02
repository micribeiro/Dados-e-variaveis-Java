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
		
		System.out.println("A maioridade penal atual no Brasil é " + maioridade);
		System.out.println("Uma centena contém " + centena + " unidades");
		System.out.println("Seria interessante receber um salário anual de " + salarioAnual + " reais");
		System.out.println("Esse salário de " + salarioAnualDolar + " dólares não vale muito nos EUA");
		System.out.println("Minha meta de patrimônio é " + patrimonioDesejado + " reais");
		System.out.println("O salário mensal do menino Ney é " + salarioNeymar + " reais");
		System.out.println("A população brasileira é cerca de " + populacaoBrasil);
		System.out.println("A população da Índia é cerca de " + populacaoIndia);
		System.out.println("O mundo possui cerca de " + populacaoMundial + " pessoas");
		System.out.println("O patrimônio do Bill Gates é cerca de " + patrimonioBillGates + " reais");
		System.out.println("No inverno, a temperatura média do Polo Norte é " + temperaturaMediaPoloNorte + 
				"°C. Já no Polo Sul, " + temperaturaMediaPoloSul + "°C");
		System.out.println("Primeira letra do alfabeto: " + primeiraLetra);
		System.out.println("Um caractere aleatório: " + caractereAleatorio);
		System.out.println("Frase: " + inicioFrase + livroFamoso);
		System.out.println("Lobo é " + lobo + " e ovelha é " + ovelha);
		
	}

}
