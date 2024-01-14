package day98;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nama;
		double harga, jarak;
		inputan("=========================\n===== Taksi Online =====\n\n");
		inputan("Masukkan Nama \t\t: ");
		nama = input.nextLine();
		inputan("Masukkan Jarak (km) \t: ");
		jarak = input.nextDouble();
		harga = (Math.ceil(jarak))* 5000;
		inputan("Total harga Rp. \t: "+harga);
		inputan("\n\n===== Semangat =====\n=========================");
	}
	
	public static void inputan(String cetak){
		System.out.print(cetak);
	}
}
