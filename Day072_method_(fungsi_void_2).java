package day72;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Perkalian =====\n");
		
		int angka1, angka2;
		
		System.out.print("Masukkan angka : ");
		angka1 = input.nextInt();
		System.out.print("Masukkan angka : ");
		angka2 = input.nextInt();
		hasil(angka1,angka2);
		
		System.out.println("\n===== Semangat =====");
	}
	
	private static void hasil(int a, int b){
		System.out.println("\nHasil perkalian dari "+a+" x "+b+" adalah "+(a * b));
	}
}
