package com.dsajourney.p01_beginner.p01_patterns;

import java.util.Scanner;

public class Pattern01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the n : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
