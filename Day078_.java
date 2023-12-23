package day78;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===== Mendeteksi genap ganjil pada array =====\n\n=== Array 2 Dimensi ===\n");
		
		int[][] array2D = {
			{2, 4, 6, 8, 9},
			{6, 7, 3, 1 ,10}
		};
		
		for (int a = 0; a < array2D.length; a++){
			System.out.print("[");
			for (int b = 0; b < array2D[a].length; b++){
				System.out.print(array2D[a][b]+",");
			}
			System.out.println("]");
		}
		
		System.out.println();
		
		for (int c = 0; c < array2D.length; c++){
			for (int d = 0; d < array2D[c].length; d++){
				
				if (array2D[c][d] % 2 == 0){
					System.out.println(array2D[c][d]+" adalah angka genap");
				} else {
					System.out.println(array2D[c][d]+" adalah angka ganjil");
				}
			}
		}
		
		System.out.println("\n===== Semangat =====");
		
	}
}
