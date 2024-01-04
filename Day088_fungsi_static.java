package day88;

public class Main {
	
	static String nama, makanan;
	
	public static void main(String[] args) {
		
		System.out.println("===== Fungsi Static =====\n\n===== Kucing =====");
		kucing();
		System.out.println("\n===== Kambing =====");
		kambing();
		System.out.println("\n===== Semangat =====");
		
	}
	
	static void kucing(){
			
		nama = "Gery";
		makanan = "Daging";
		System.out.println("Nama kucing saya adalah "+nama);
		System.out.println("Kucing saya suka makan "+makanan);
		
	}
		
	static void kambing(){
		
		nama = "Lery";
		makanan = "Rumput";	
		System.out.println("Nama kambing saya adalah "+nama);
		System.out.println("Kambing saya suka makan "+makanan);
			
	}
}
