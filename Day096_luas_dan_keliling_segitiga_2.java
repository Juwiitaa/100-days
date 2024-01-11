package day96;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double alas, tinggi, sisi1, sisi2, sisi3;
		
		alas = inputan(input, "Masukkan panjang alas segitiga : ");
		tinggi = inputan(input, "Masukkan tinggi segitiga : ");
		sisi1 = inputan(input, "Masukkan panjang sisi 1 segitiga : ");
		sisi2 = inputan(input, "Masukkan panjang sisi 2 segitiga : ");
		sisi3 = inputan(input, "Masukkan panjang sisi 3 segitiga : ");
		input("\nLuas segitiga = "+luas(alas, tinggi));
		input("Keliling segitiga = "+keliling(sisi1, sisi2, sisi3));
		input("\n===== Semangat =====");
		
	}
	
	static double inputan(Scanner input, String cetak){
		System.out.print(cetak);
		return input.nextDouble();
	}
	
	static double luas(double a, double b){
		double hasil = 0.5 * a * b;
		return hasil;
	}
	
	static double keliling(double a, double b, double c){
		double hasil = a + b + c;
		return hasil;
	}
	
	static void input(String cetak){
		System.out.println(cetak);
	}
}
