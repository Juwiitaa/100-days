package day83;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===== Membeli Komputer Sultan =====\n\nHarga Komputer = 55 Juta\nTabungan Maksimal = 1.5 Juta");
		
		double komputerTarget, tabunganMaksimal, bulan;
		
		komputerTarget = 55000000;
		tabunganMaksimal = 1500000;
		
		bulan = komputerTarget / tabunganMaksimal;
		
		System.out.println("\nButuh "+bulan+" bulan untuk membeli Komputer Sultan");
		
		//pembulatan angka
		System.out.println("\nKarena minimal, maka butuh "+Math.ceil(bulan)+" bulan untuk membeli komputer sultan\n\n===== Semangat =====");
		
	}
}
