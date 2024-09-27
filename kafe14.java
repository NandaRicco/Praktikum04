package Praktikum04;
import java.util.Scanner;

public class kafe14 {
    
    public static void main(String[] args) {
        
        Scanner kfe = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan Menu                     : ");
        menu = kfe.nextLine();
        System.out.print("Masukkan Ukuran Cup               : ");
        ukuranCup = kfe.next().charAt(0);
        System.out.print("Masukkan Jumlah                   : ");
        jumlah = kfe.nextInt();
        System.out.print("Masukkan Keanggotaan (true/false) :");
        keanggotaan = kfe.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        double totalHarga = hargaMenu + jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.40 * totalHarga;
                break;
            default:
            System.out.println("Size tidak tersedia");
        }
        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = totalHarga - (diskon - totalHarga);

        System.out.println("Item Pembelian : " + jumlah + " " + menu + " dengan ukuran Cup " + ukuranCup);
        System.out.println("Nominal bayar  : " + nominalBayar);
    }
}
