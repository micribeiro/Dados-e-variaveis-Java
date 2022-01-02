package com.dio;

public class CalculationsInJava {

	public static void main(String[] args) {
		int age = 24;
		int time = age++;
		int reverseTime = age--;
		
		int tPlus1 = ++age;
		int tMinus1 = --age;
		
		int mod = tPlus1 % age;
		int plus5 = age += 5;
		int minus4 = age -= 4;
		int dividPer2 = age /= 2;
		int multipPer4 = age *= 4;
		int newModPer3 = age %= 3;
		
		System.out.println("Post fixed:");
		System.out.println("time: " + time);
		System.out.println("reverseTime: " + reverseTime);
		
		System.out.println("\nPre fixed:");
		System.out.println("Age plus one: " + tPlus1);
		System.out.println("Age minus one: " + tMinus1);
		
		System.out.println("\nMod and Assignment:");
		System.out.println("Mod of the next year age by real age division:  " + mod);
		System.out.println("I will be " + plus5 + " five years after today");
		System.out.println("And if we return 4 years: " + minus4);
		System.out.println("Half age: " + dividPer2);
		System.out.println("And if we multiply by 4? " + multipPer4);
		System.out.println("The mod of my age divided by 3 is " + newModPer3);

	}

}
