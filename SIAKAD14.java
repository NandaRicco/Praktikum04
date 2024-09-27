package Praktikum04;
import java.util.Scanner;

public class SIAKAD14 {
    
    public static void main(String[] args) {
        
        Scanner skad = new Scanner(System.in);

        String nama, nim, kelas, nilaiHuruf = "", kualifikasi = "";
        int noAbsen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiSetara;

        System.out.print("Masukkan Nama          : ");
        nama = skad.nextLine();
        System.out.print("Masukkan NIM           : ");
        nim = skad.nextLine();
        System.out.print("Masukkan Kelas         : ");
        kelas = skad.nextLine();
        System.out.print("Masukkan No Absen      : ");
        noAbsen = skad.nextInt();
        System.out.print("Masukkan Nilai Kuis    : ");
        nilaiKuis = skad.nextDouble();
        System.out.print("Masukkan Nilai Tugas   : ");
        nilaiTugas = skad.nextDouble();
        System.out.print("Masukkan nilai Ujian   : ");
        nilaiUjian = skad.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik"; 
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            kualifikasi = "Baik"; 
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup"; 
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup"; 
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang"; 
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal"; 
        } else {
            System.out.println("Nilai tidak valid");
        } 
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") " + "kelas " + kelas + " nomor absen " + noAbsen);
        System.out.println("Nilai Akhir            : " + nilaiAkhir);
        System.out.println("Nilai Huruf            : " + nilaiHuruf);
        System.out.println("Kualifikasi            : " + kualifikasi);
    }
}
