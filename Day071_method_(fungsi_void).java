package day71;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jumlah Mahasiswa : ");
		int jumlah = input.nextInt();
		int jumlahNama = 1;
		System.out.println();
		
		while(jumlahNama <= jumlah){
			System.out.print("Masukkan nama : ");
			String nama = input.next();
			namaNama(nama);
			jumlahNama++;
		}
		
		System.out.println("\n===== Semangat =====");
		
	}
	
	private static void namaNama(String nama){
		System.out.println("Nama Mahasiswa Baru : "+nama);
		
	}
}
