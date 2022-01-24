package com.dio2;

public class Main {

	public static void main(String[] args) {

		double monthlySalary = 11000.5d;
		double averageSalary = 10500d;
		
		int dependentsQuantity = 4;
		int averageDependents = 2;
		
		System.out.println((monthlySalary < averageSalary) && 
				(dependentsQuantity >= averageDependents));
		
		boolean lowSalary = (monthlySalary < averageSalary);
		boolean manyDependents = (dependentsQuantity >= averageDependents);
		
		System.out.println((lowSalary) && (manyDependents));
		
		boolean earnAid = (lowSalary) && (manyDependents);
		System.out.println("earnAid: " + earnAid);

	}

}
