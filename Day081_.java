package day81;

public class PolaBintangSamaKaki {
    
    public static void main(String[] args) {
        
        int tinggi = 5;
        
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
