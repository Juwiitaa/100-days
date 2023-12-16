package day69;

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
		
		System.out.println("\n=== For loop ===\n");
		
		for (int e = 0; e < array.length; e++){
			System.out.println("== Kotak ke "+(e+1)+" ==");
			for (int f = 0; f < array[e].length; f++){
				System.out.println("= Sisi ke "+(f+1)+" =");
				for (int g = 0; g < array[e][f].length; g++){
					System.out.print("[");
					for (int h = 0; h < array[e][f][g].length; h++){
						System.out.print(array[e][f][g][h]+(","));
					}
					System.out.println("]");
				}
			}
		}
		
		System.out.println("\n=== For-each loop ===\n");
		
		for (int i = 0; i < array.length; i++){
			System.out.println("== Kotak ke "+(i+1)+" ==");
			for (int j = 0; j < array[i].length; j++){
				System.out.println("Sisi ke "+(j+1));
				for (int[] k : array[i][j]){
					System.out.print("[");
					for (int l : k){
						System.out.print(l+",");
					}
					System.out.println("]");
				}
			}
		}
		
		System.out.println("\n=== While loop ===\n");
		
		int m = 0;
		while (m < array.length){
			System.out.println("=== Layer ke "+(m+1)+" ===");
			int n = 0;
			while (n < array[m].length){
				System.out.println("Sisi ke "+(n+1));
				int o = 0;
				while (o < array[m][n].length){
					System.out.print("[");
					int p = 0;
					while (p < array[m][n][o].length){
						System.out.print(array[m][n][o][p]+",");
						p++;
					}
					o++;
					System.out.println("]");
				}
				n++;
			}
			m++;
		}
		
		System.out.println("\n=== Do-while loop ===\n");
		
		int q = 0;
		do{
			System.out.println("=== Layer ke "+(q+1)+" ===");
			int r = 0;
			do{
				System.out.println("Sisi ke "+(r+1));
				int s = 0;
				do{
					System.out.print("[");
					int t = 0;
					do{
						System.out.print(array[q][r][s][t]+",");
						t++;
					}while (t < array[q][r][s].length);
					System.out.println("]");
					s++;
				}while (s < array[q][r].length);
				r++;
			}while (r < array[q].length);
			q++;
		}while (q < array.length);
		
		System.out.println("\n===== Semangat =====");
		
	}
}
