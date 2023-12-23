package day79;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===== Mendeteksi genap ganjil pada array =====\n\n=== Array 3 Dimensi ===\n");
		
		int[][][] array3D = {
			{
				{2, 1, 6, 9, 8},
				{7, 7, 3, 5 ,2}
			},
			{
				{11, 37 ,25, 18, 13},
				{20, 24, 26, 22, 28}
			}
		};
		
		for (int a = 0; a < array3D.length; a++){
			System.out.println("== Layer ke "+(a+1)+" ==");
			for (int b = 0; b < array3D[a].length; b++){
				System.out.print("[");
				for (int c = 0; c < array3D[a][b].length; c++){
					System.out.print(array3D[a][b][c]+",");
				}
				System.out.println("]");
			}
		}
		
		System.out.println();
		
		for (int d = 0; d < array3D.length; d++){
			for (int e = 0; e < array3D[d].length; e++){
				for (int f = 0; f < array3D[d][e].length; f++){
				
					if (array3D[d][e][f] % 2 == 0){
						System.out.println(array3D[d][e][f]+" adalah angka genap");
					} else {
						System.out.println(array3D[d][e][f]+" adalah angka ganjil");
					}
				}
			}
		}
		
		System.out.println("\n===== Semangat =====");
		
	}
}
