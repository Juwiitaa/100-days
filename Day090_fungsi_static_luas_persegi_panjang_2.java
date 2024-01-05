package day90;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Menghitung Luas Persegi Panjang =====\n");
		System.out.print("Masukkan panjang : ");
		int panjang = inputan(input);
		System.out.print("Masukkan lebar : ");
		int lebar = inputan(input);
		luasPersegiPanjang(panjang, lebar);
		System.out.println("\n===== Semangat =====");
	}
	
	static int inputan(Scanner input){
		return input.nextInt();
	}
	
	static void luasPersegiPanjang(int a, int b){
		int luas = a * b;
		System.out.println("\nJadi luas persegi panjang tersebut adalah "+luas);
	}
}
