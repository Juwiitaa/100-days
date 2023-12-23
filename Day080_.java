package day80;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===== Mendeteksi genap ganjil pada array =====\n\n=== Array 4 Dimensi ===\n");
		
		int[][][][] array4D = {
			{
				{
					{2, 1, 6, 9, 8},
					{7, 7, 3, 5 ,2}
				}
			},
			{
				{
					{11, 37 ,25, 18, 13},
					{20, 24, 26, 22, 28}
				}
			}
		};
		
		for (int a = 0; a < array4D.length; a++){
			System.out.println("== Layer ke "+(a+1)+" ==");
			for (int b = 0; b < array4D[a].length; b++){
				System.out.println("= Sisi ke "+(b+1)+" =");
				for (int c = 0; c < array4D[a][b].length; c++){
					System.out.print("[");
					for (int d = 0; d < array4D[a][b][c].length; d++){
						System.out.print(array4D[a][b][c][d]+",");
					}
					System.out.println("]");
				}
			}
		}
		
		System.out.println();
		
		for (int e = 0; e < array4D.length; e++){
			for (int f = 0; f < array4D[e].length; f++){
				for (int g = 0; g < array4D[e][f].length; g++){
					for (int h = 0; h < array4D[e][f][g].length; h++){
						if (array4D[e][f][g][h] % 2 == 0){
							System.out.println(array4D[e][f][g][h]+" adalah angka genap");
						} else {
							System.out.println(array4D[e][f][g][h]+" adalah angka ganjil");
						}
					}
				}
			}
		}
		
		System.out.println("\n===== Semangat =====");
		
	}
}
