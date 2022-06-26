package com.avinya.algorithm.utils;

public class CheckUpperLowerCase {

	public static void main(String[] args) {
		String s = "NeeRaJ";
		char[] c = s.toCharArray();
		for(int i=0; i<c.length-1; i++) {
			System.out.println("1 :-  "+c[i]+ " - "+Character.isAlphabetic(c[i]));
			
			System.out.println("2 :-  "+c[i]+ " - "+Character.isUpperCase(c[i]));
			
			System.out.println("3 :-  "+c[i]+ " - "+Character.isLowerCase(c[i]));
			
			
		}

	}

}
