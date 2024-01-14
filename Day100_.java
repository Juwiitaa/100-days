package day100;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double nilaiTugas, tugas1, tugas2, tugas3, uts, uas, nilaiUts, nilaiUas, nilaiTotal;
		input("=========================\nPenilaian Akhir Semester\n");
		tugas1 = inputan(input, "Masukkan nilai tugas 1 \t: ");
		tugas2 = inputan(input, "Masukkan nilai tugas 2 \t: ");
		tugas3 = inputan(input, "Masukkan nilai tugas 3 \t: ");
		uts = inputan(input, "Masukkan nilai UTS \t: ");
		uas = inputan(input, "Masukkan nilai UAS \t: ");
		nilaiTugas = ((tugas1+tugas2+tugas3)/3) * 0.2;
		nilaiUts = uts * 0.3;
		nilaiUas = uas * 0.5;
		nilaiTotal= nilaiTugas + nilaiUts + nilaiUas;
		input("\n=========================\nTotal Nilai\n\nNilai anda "+Math.ceil(nilaiTotal));
		input("\n=========================\nPenilaian Akhir\n");
		
		if (Math.ceil(nilaiTotal)< 70){
			input("Anda tidak lulus dan harus mengulang kembali atau memperbaiki nilai!");
		} else if (Math.ceil(nilaiTotal) > 69 && nilaiTotal <= 100){
			input("Selamat anda lulus");
		} else {
			input("Nilai anda tidak dapat di deteksi");
		}
		
		input("\n=========================\nCacatan\n");
		
		if (tugas1 < 70){
			input("- Nilai tugas pertama anda butuh perbaikan jika anda tidak lulus");
		}
		if (tugas2 < 70){
			input("- Nilai tugas kedua anda butuh perbaikan jika anda tidak lulus");
		}
		if (tugas3 < 70){
			input("- Nilai tugas ketiga anda butuh perbaikan jika anda tidak lulus");
		}
		if (uts < 70){
			input("- Nilai UTS anda tidak lulus dan butuh perbaikan jika anda tidak lulus");
		}
		if (uas < 70){
			input("- Nilai UAS anda tidak lulus dan butuh perbaikan jika anda tidak lulus");
		}
		
		input("\n=========================\nPredikat\n");
		
		if (nilaiTotal < 21){
			input("Predikat anda E");
		} else if (nilaiTotal < 41){
			input("Predikat anda D");
		} else if (nilaiTotal < 61){
			input("Predikat anda C");
		} else if (nilaiTotal < 81){
			input("Predikat anda B");
		} else if (nilaiTotal <= 100){
			input("predikat anda A");
		} else {
			input("Predikat anda E");
		}
		
		input("\n===== Semangat =====\n=========================");
		
	}
	
	public static void input(String cetak){
		System.out.println(cetak);
	}
	
	public static double inputan(Scanner input, String cetak){
		System.out.print(cetak);
		return input.nextDouble();
	}
}
