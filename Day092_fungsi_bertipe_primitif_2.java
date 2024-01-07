package day92;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Angka yang habis dibagi 3 dan 5 =====\n");
		System.out.print("Masukkan angka : ");
		int angka = input.nextInt();
		hasil(angka);
		System.out.println("\n===== Semangat =====");
	}
	
	static void hasil(int a){
		if (a % 3 == 0 && a % 5 == 0){
			System.out.println("\nMaster Class");
		} else if (a % 3 == 0){
			System.out.println("\nPride of 3");
		} else if (a % 5 == 0){
			System.out.println("\nPride of 5");
		} else {
			System.out.println("\nAngka tersebut tidsk habis dibagi 3 dan 5");
		}
	}
}
