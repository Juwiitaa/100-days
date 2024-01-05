package day89;

public class Main {
	
	public static void main(String[] args) {
		
		judul();
		luasPersegiPanjang(6, 4);
		System.out.println("\n===== Semangat =====");
		
	}
	
	static void judul(){
		System.out.println("===== Menghitung Luas Persegi Panjang =====\n");
		System.out.println("panjang persegi panjang adalah 6");
		System.out.println("lebar persegi panjang adalah 4");
	}
	
	static void luasPersegiPanjang(int a, int b){
		int luas = a * b;
		System.out.println("Jadi luas persegi panjang tersebut adalah "+luas);
		
	}
	
	static void semangat(){
		System.out.println("\n===== Semagat =====");
		
	}
}
