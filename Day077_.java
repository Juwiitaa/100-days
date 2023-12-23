package day77;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===== Mendeteksi genap ganjil pada array =====\n\n=== Array 1 Dimensi ===\n");
		
		int[] array1D = {2, 7, 4, 3, 9};
		
		System.out.print("[");
		
		for (int a = 0; a < array1D.length;a++){
			System.out.print(array1D[a]+",");
		}
		
		System.out.println("]\n");
		
		for (int b = 0; b < array1D.length; b++){
			if (array1D[b] % 2 == 0){
				System.out.println(array1D[b]+" adalah angka genap");
			} else {
				System.out.println(array1D[b]+" adalah angka ganjil");
			}
		}
		
		System.out.println("\n===== Semangat =====");
		
	}
}
