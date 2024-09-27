package Praktikum04;
import java.util.Scanner;

public class umur {
    
    public static void main(String[] args) {
        
        Scanner umr = new Scanner(System.in);

        int umur;

        System.out.print("Masukan Umur : ");
        umur = umr.nextInt();

        if (umur < 0) {
                System.out.println("Usia tidak valid");
            } else if (umur <= 12){
                    System.out.println("Kategori Anak");
            } else if (umur <= 19) {
                    System.out.println("Kategori Remaja");
            } else if (umur <= 64) {
                    System.out.println("Kategori Dewasa");
            } else if (umur >= 65) {
                    System.out.println("Kategori Lansia");
            }
    }
}
