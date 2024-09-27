package Praktikum04;
import java.util.Scanner;

public class login {
    
    public static void main(String[] args) {

        Scanner lgn = new Scanner(System.in);

        String username = "Nanda";
        String password = "12345";

        System.out.print("Masukan Username : ");
        String usernameString = lgn.nextLine();

        System.out.print("Masukan Password : ");
        String passwordString = lgn.nextLine();

        if (usernameString.equals(username) && passwordString.equals(password)){
            System.out.println("Berhasil login akun");
        } else {
            System.out.println("User atau Password salah");
        }
    }
}
