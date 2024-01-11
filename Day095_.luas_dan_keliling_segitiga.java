package day95;
public class Main {
	public static void main(String[] args) {
		
		double alas = 5, tinggi = 3.0 , sisi1 = 4.0, sisi2 = 4.0, sisi3 = 4.0;
		
		System.out.println("===== Menghitung Luas dan Keliling Segitiga =====\n");
		System.out.println("Luas segitiga = "+luas(alas, tinggi));
		System.out.println("Keliling segitiga = "+keliling(sisi1, sisi2, sisi3));
		System.out.println("\n===== Semangat =====");
		
	}
	
	static double luas(double a, double b){
		double hasil = 0.5 * a * b;
		return hasil;
	}
	
	static double keliling(double a, double b, double c){
		double hasil = a + b + c;
		return hasil;
	}
}
