package day76;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan luas tanah (m) : ");
		int luas = input.nextInt();
		
		double hargaJual = luas * 300000;
		double pajak = 0;
		
		if (hargaJual < 50000000){
			pajak = hargaJual * 0.01;
		} else if (hargaJual >= 50000000){
			pajak = hargaJual * 0.03;
		} else if (hargaJual >= 100000000){
			pajak = hargaJual * 0.05;
		}
		
		double uangBersih = hargaJual - pajak;
		
		System.out.println("\nUang Bersih = Rp. "+uangBersih);
		System.out.println("dan dari potongan pajak sebesar Rp. "+pajak);
		
		System.out.println("\n===== Semangat =====");
		
	}
}
