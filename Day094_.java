package day94;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Membeli Komputer Sultan =====");
		double target, tabungan;
		System.out.print("Masukkan harga komputer : ");
		target = inputan(input);
		System.out.print("Masukkan tabungan maksimal/bulan : ");
		tabungan = inputan(input);
		hasil(target, tabungan);
		System.out.println("===== Semangat =====");
	}
	
	static double inputan(Scanner input){
		
		return input.nextInt();
	}
	
	static void hasil(double a, double b){
		
		a /= b;
		System.out.println("butuh "+Math.ceil(a)+" bulan untuk membeli komouter sultan");
	}
}
