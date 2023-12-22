package day75;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Memanggil Method =====\n");
		
		System.out.print("Nama : ");
		String nama = input.next();
		
		biodata(nama);
		biodata(nama);
		
		System.out.println("\n===== Semangat =====");
		
	}
	
	static void biodata(String nama){
		
		System.out.println("Nama saya adalah : "+nama);
		
	}
}
