package day99;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String password;
		int pilih;
		
		while(true){
			input("=========================\n===== Login =====\n");
			input("\nMasuk sebagai\n1. Dosen\n2. Mahasiswa\nPilih menu (1/2) : ");
			pilih = input.nextInt();
			
			if (pilih == 1){
				password = inputan(input, "Masukkan password : ");
				if (password.equals("dsn123")){
					input("\n===== Selamat Datang Dosen =====");
					break;
				} else {
					input("Password yang anda masukkan salah!\n\n");
				}
			} else if (pilih == 2){
				password = inputan(input, "Masukkan password : ");
				if (password.equals("mhs321")){
					input("\n===== Selamat Datang Mahasiswa =====");
					break;
				} else {
					input("Password yang anda masukkan salah!\n\n");
				}
			} else {
				input("\nPilihan anda tidak valid!");
			}
		}
		
		input("\n\n===== Semangat =====\n=========================");
	}
	
	public static void input(String cetak){
		System.out.print(cetak);
	}
	
	public static String inputan(Scanner input,String cetak){
		System.out.print(cetak);
		return input.next();
	}
}
