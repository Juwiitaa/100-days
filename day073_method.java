package day73;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan angka : ");
		int angka = input.nextInt();
		
		pride(angka);
		semangat();
		
	}
	
	static void pride(int angka){
		if (angka % 3 == 0 && angka % 5 == 0){
			System.out.println("\nMaster Class");
		} else if (angka % 3 == 0){
			System.out.println("\nPride of 3");
		} else if (angka % 5 == 0){
			System.out.println("\nPride of 5");
		} else {
			System.out.println("Angka yang anda masukkan tidak habis dibagi 3 dan 5");
		}
		
	}
	
	static void semangat(){
		System.out.println("\n===== Semangat =====");
		
	}
	
}
