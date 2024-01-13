package day97;
import java.util.Scanner;
public class Main {
	
	public static void input1(String cetak){
		System.out.println(cetak);
	}
	
	public static void input2(String cetak){
		System.out.print(cetak);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pilih1, pilih2, porsi;
		double totalHarga, harga = 0;
		
		input1("===== Warteg Online =====\n");
		
		while(true){
			input1("=== daftar pilihan ===\n1. Ayam goreng (7k)\n2. Ikan goreng (5k)\n3. Tahu goreng (1k)\n4. Tempe goreng (1k)\n5. Sambal pedas (1k)\n6. Selesai");
			input2("pilih menu : ");
			pilih2 = input.nextInt();
			if (pilih2 == 1){
				harga += 7000;
			} else if (pilih2 == 2){
				harga += 5000;
			} else if (pilih2 == 3){
				harga += 1000;
			} else if (pilih2 == 4){
				harga += 1000;
			} else if (pilih2 == 5){
				harga += 1000;
			} else if (pilih2 == 6){
				break;
			} else {
				input1("Pilihan anda tidak valid!");
			}
		}		
				
			input2("Masukkan jumlah porsi : ");
			porsi = input.nextInt();
			harga *= porsi;
			totalHarga = harga + 3000;
			input1("\nHarga nasi putih Rp. 3000\nTotal harga Rp. "+totalHarga);
			
		input1("\n===== Semangat =====");
			
	}
}
