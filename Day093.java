package day93;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double gajiPokok, jamLembur;
		
		System.out.println("===== Gaji Bersih =====\n");
		System.out.print("Masukkan gaji pokok : ");
		gajiPokok = inputan(input);
		System.out.print("Masukkan lama jam lembur : ");
		jamLembur = inputan(input);
		hasil(gajiPokok, jamLembur);
		System.out.println("\n===== Semangat =====");
	}
	
	static double inputan(Scanner input){
		return input.nextDouble();
	}
	
	static void hasil(double a, double b){
		b *= 55000;
		a += b;
		System.out.println("Jadi gaji bersih yang diterima adalah Rp. "+a);
	}
}
