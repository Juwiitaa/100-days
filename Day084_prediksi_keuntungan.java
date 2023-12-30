package day84;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Prediksi keuntungan pertahun =====");
		
		System.out.print("\nMasukkan modal awal : ");
		double modalAwal = input.nextDouble();
		System.out.print("Masukkan lama Investasi (tahun) : ");
		int lamaInvestasi = input.nextInt();
		
		double keuntungan = 0;
		System.out.println();
		
		for (int a = 1; a <= lamaInvestasi; a++){
			keuntungan = modalAwal * 0.05;
			modalAwal += keuntungan;
			
			System.out.println("Keuntungan tahun ke "+a+" = "+keuntungan);
			
		}
			System.out.println("\nTotal keuntungan dari "+lamaInvestasi+" tahun adalah Rp. "+modalAwal);
			
			System.out.println("\n===== Semangat =====");
			
	}
}
