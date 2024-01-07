package day91;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("===== Fungsi return value dan paramater bertipe data primitif =====\n");
		 main();
		 int nilai1 = inputan(input);
		 main();
		 int nilai2 = inputan(input);
		 hasil(nilai1, nilai2);
		 System.out.println("\n===== Semangat =====");
	}
	
	static void main(){
		System.out.print("Masukkan angka : ");
	}
	
	static int inputan(Scanner input){
		return input.nextInt();
	}
	
	static void hasil(int a, int b){
		int hasil = a + b;
		if (hasil %2 == 0){
			System.out.println("Hasil akhir = "+hasil+1);
		} else {
			System.out.println("Hasil akhir = "+hasil+2);
		}
	}
}
