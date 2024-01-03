package day87;

public class Main {
	
	String nama, makanan;
	
	public static void main(String[] args) {
		
		Main Hewan = new Main();
		
		System.out.println("===== Fungsi Void =====\n");
		System.out.println("===== Kucing =====");
		Hewan.kucing();
		System.out.println("\n===== Kambing =====");
		Hewan.kambing();
		System.out.println("\n===== Semangat =====");
		
	}
	
	void kucing(){
		
		nama = "Gery";
		makanan = "Daging";
		System.out.println("Nama Kucing saya adalah "+nama);
		System.out.println("Kucing saya suka makan "+makanan);
		
	}
	
	void kambing(){
		
		nama = "Lery";
		makanan = "Rumput";
		System.out.println("Nama Kambing saya adalah "+nama);
		System.out.println("Kambing saya suka makan "+makanan);
		
	}
}
