package pkg2_text;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        int umur;
        System.out.print("Masukkan nama >> ");
        nama = input.nextLine();
        System.out.print("Masukkan umur >> ");
        umur = input.nextInt();
        
        System.out.println(" Nama \t = " + nama);
        System.out.println(" Umur \t = " + umur);
        
        
    }
    
}
