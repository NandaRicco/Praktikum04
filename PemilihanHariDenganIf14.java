package Praktikum04;
import java.util.Scanner;

public class PemilihanHariDenganIf14 {
    
    public static void main(String[] args) {
        
        Scanner hri = new Scanner(System.in);

        int number;
        String dayType;

        System.out.print("Input number : ");
        number = hri.nextInt();

        if (number >=1 && number <=5 ){
            dayType = "Weekday";
            System.out.println("Hari ini adalah " + dayType);
        } else if (number >=6 && number <= 7){
            dayType = "Weekend";
            System.out.println("Hari ini adalah " + dayType);
        } else {
            System.out.println("Invalid Number");
        }
    }
}
