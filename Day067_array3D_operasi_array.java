package day67;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===== Opeasi Array 3 Dimensi =====");
		
		int[][][] array = {
			{
				{1,2,3},
				{2,3,4},
				{3,4,5}
			},
			{
				{4,5,6},
				{5,6,7},
				{6,7,8}
			}
		};
		
		int jumlah = 0;
		
		System.out.println();
		
		for (int a = 0; a < array.length; a++){
			System.out.println("=== Layer ke "+(a+1)+" ===");
			for (int b = 0; b < array[a].length; b++){
				System.out.print("[");
				for (int c = 0; c < array[a][b].length; c++){
					System.out.print(array[a][b][c]+(","));
					jumlah += array[a][b][c];
				}
				System.out.println("]");
			}
		}
		
		System.out.println("\nHasil penjumlahan dari keseluruhan array tersebut adalah "+jumlah);
		System.out.println("\n===== Semangat =====");
		
	}
}
