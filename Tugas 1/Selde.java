import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        String angka, hasil = "";
        Scanner scanner = new Scanner(System.in);

        angka = scanner.nextLine();
        int jumlah = angka.length();
        int jumlahangka = jumlah - 1;
        for (int i = 0; i < jumlah; i++) {
            hasil = hasil + angka.charAt(jumlahangka);
            jumlahangka--;
        }
        if (angka.equals(hasil)) {
            System.out.println(angka + " adalah selde.");
        } else {
            System.out.println(angka + " bukan selde.");
        }

    }
}