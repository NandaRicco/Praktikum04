package Praktikum04;
import java.util.Scanner;

public class parkir {
    
    public static void main(String[] args) {
        
        Scanner prk = new Scanner(System.in);
        int lama, tarifParkir, totalTatif;

        System.out.print("Masukkan jenis kendaraan yang diparkir (mobil/motor): ");
        String jenisKendaraan = prk.nextLine();
        System.out.print("Masukkan lama parkir (Dalam Jam)                    : ");
        lama = prk.nextInt();

        if (jenisKendaraan.equals("mobil")) {
            tarifParkir = 5000;
            totalTatif = tarifParkir * lama;
        } else if (jenisKendaraan.equals("motor")) {
            tarifParkir = 3000;
            totalTatif = tarifParkir * lama;
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
            return;
        }

        System.out.println();
        System.out.println("=========== Program Parkir ==========");
        System.out.println();
        System.out.println("Jenis kendaraan : " + jenisKendaraan);
        System.out.println("Total biaya     : " + totalTatif);
        
    }
}
