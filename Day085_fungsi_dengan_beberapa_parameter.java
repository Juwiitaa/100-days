package day85;
public class Main {
	public static void main(String[] args) {
		
		judul();
		operasi(5, 5);
		semangat();
		
	}
	
	static void judul(){
		
		System.out.println("===== Fungsi dengan beberapa parameter =====\n=== Operasi Aritmatika ===\n");
	}
	
	static void operasi(int angka1, int angka2){
		
		int hasilTambah = angka1 + angka2;
		int hasilKurang = angka1 - angka2;
		int hasilKali = angka1 * angka2;
		int hasilBagi = angka1 / angka2;
		int hasilSisaBagi = angka1 % angka2;
		
		System.out.println("Hasil penjumlahan dari "+angka1+" + "+angka2+" = "+hasilTambah);
		System.out.println("Hasil pengurangan dari "+angka1+" - "+angka2+" = "+hasilKurang);
		System.out.println("Hasil perkalian dari "+angka1+" x "+angka2+" = "+hasilKali);
		System.out.println("Hasil pembagian dari "+angka1+" / "+angka2+" = "+hasilBagi);
		System.out.println("Hasil sisa bagi dari "+angka1+" % "+angka2+" = "+hasilSisaBagi);
		
	}
	
	static void semangat(){
		System.out.println("\n ===== Semangat =====");
		
	}
		
}
