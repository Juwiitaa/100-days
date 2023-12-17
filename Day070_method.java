package day70;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Fungsi Static dan Void =====\n=== Penjumlahan ===\n");
		
		int nilai1,nilai2,jumlah;
		System.out.print("Masukkan angka : ");
		nilai1 = input.nextInt();
		System.out.print("Masukkan angka : ");
		nilai2 = input.nextInt();
		jumlah = tambah(nilai1,nilai2);
		hasil(nilai1, nilai2);
		
		System.out.println("\n===== Semangat =====");
	}
	
	public static void hasil(int a, int b){
		System.out.println("\nHasil penjumlahan dari "+a+" + "+b+" adalah "+tambah(a, b));
	}
		
	public static int tambah(int a, int b){
			return a + b;
	}
}
