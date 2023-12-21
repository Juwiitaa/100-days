package day74;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Gaji Bersih =====\n");
		
		System.out.print("Masukkan gaji pokok : ");
		double pokok = input.nextDouble();
		System.out.print("Masukkan banyak jam lembur : ");
		int jam = input.nextInt();
		
		double jamLembur = jam * 55000;
		double gajiBersih = jamLembur + pokok;
		
		System.out.println("\nGaji bersih : "+gajiBersih);
		
		System.out.println("\n===== Semangat =====");
		
	}
}
