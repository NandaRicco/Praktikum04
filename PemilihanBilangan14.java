package Praktikum04;
import java.util.Scanner;

public class PemilihanBilangan14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Sebuah Angka : ");
        int angka = sc.nextInt();
        String hasil;

        hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(angka + " Adalah " + hasil);

    }
}