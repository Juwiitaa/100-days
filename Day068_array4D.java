package day68;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int jumlahKotak, jumlahSisi, jumlahBaris, jumlahKolom;
		
		System.out.println("===== Array 4 Dimensi =====\n");
		
		System.out.print("Masukkan jumlah kotak : ");
		jumlahKotak = input.nextInt();
		System.out.print("Masukkan jumlah sisi  : ");
		jumlahSisi = input.nextInt();
		System.out.print("Masukkan jumlah baris : ");
		jumlahBaris = input.nextInt();
		System.out.print("Masukkan jumlah kolom : ");
		jumlahKolom = input.nextInt();
		
		System.out.println();
		
		int[][][][] array = new int [jumlahKotak][jumlahSisi][jumlahBaris][jumlahKolom];
		
		for (int a = 0; a < jumlahKotak; a++){
			for (int b = 0; b < jumlahSisi; b++){
				for (int c = 0; c < jumlahBaris; c++){
					for (int d = 0; d < jumlahKolom; d++){
						System.out.print("Input elemen : ");
						array[a][b][c][d] = input.nextInt();
					}
				}
			}
		}
		
		System.out.println();
		
		for (int e = 0; e < array.length; e++){
			System.out.println("=== Kotak ke "+(e+1)+" ===");
			for (int f = 0; f < array[e].length; f++){
				System.out.println("== Sisi ke "+(f+1)+" ==");
				for (int g = 0; g < array[e][f].length; g++){
					System.out.print("[");
					for (int h = 0; h < array[e][f][g].length; h++){
						System.out.print(array[e][f][g][h]+(","));
					}
					System.out.println("]");
				}
			}
		}
		
		System.out.println("\n===== Semangat =====");
		
	}
}
