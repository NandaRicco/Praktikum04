package Praktikum04;
import java.util.Scanner;

public class rambu {
    
    public static void main(String[] args) {
        
        Scanner lm = new Scanner(System.in);

        String warna;
        
        System.out.print("Masukkan Warna Lampu Lalu Lintas (merah/kuning/hijau): ");
        warna = lm.nextLine();

        switch (warna.toLowerCase()) {
            case "merah":
                System.out.println("Lampu Merah: Berhenti");
                break;
            case "kuning":
                System.out.println("Lampu Kuning: Kurangi Kecepatan");
                break;
            case "hijau":
                System.out.println("Lampu Hijau: Jalan");
                break;
            default:
                System.out.println("Input tidak valid. Silakan masukkan 'merah', 'kuning', atau 'hijau'.");
                break;
        }
    }
}
