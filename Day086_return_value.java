package day86;

public class Main {
	
	public static void main(String[] args) {
		
		judul();
		System.out.println("Luas segitiga adalah: "+hitungLuasSegitiga(5, 7));
		semangat();
	}
	
	static double hitungLuasSegitiga(double alas, double tinggi) {
    	return (alas * tinggi) / 2;
	}
	
	static void semangat(){
  		System.out.println("\n===== Semangat =====");
	}
	
	static void judul(){
		System.out.println("===== Return Value =====\n");
	}
}
