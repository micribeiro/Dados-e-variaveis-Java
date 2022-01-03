package com.dio;

public class Casting {

	public static void main(String[] args) {
		
		byte b0;
		short s0 = 1000;
		b0 = (byte) s0;
		
		long l0;
		int i0 = 10;
		l0 = i0;
		
		int i1;
		long l1 = 100000000000L;
		i1 = (int) l1;
		
		int i2;
		long l2 = 1000L;
		i2 = (int) l2;
		
		double d0;
		float f0 = 10.5f;
		d0 = f0;
		
		float f1;
		float f2;
		double d1 = 10000.58d;
		f1 = (float) d1;
		double d2 = 1000.58888373883873658347659834757377585d;
		f2 = (float) d2;
		
		int i3;
		float f3 = 11.488453f;
		i3 = (int) f3;
		
		System.out.println("b0 = " + b0);
		System.out.println("l0 = " + l0);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("d0 = " + d0);
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		System.out.println("i3 = " + i3);

	}

}
