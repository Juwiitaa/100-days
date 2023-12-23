package day82;

import java.util.Scanner;

public class PolaBintangSamaKaki {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = scanner.nextInt();
        
        System.out.println();
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n===== Semangat =====");
        
    }
}
