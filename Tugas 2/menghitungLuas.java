import java.util.*;
import java.io.*;

class Persegi {
    void getLuas(int sisi) {
        int luas = sisi * sisi;

        System.out.print(luas);
    }
}

class Segitiga {
    void getLuas(int alas, int tinggi) {
        int luas = (alas * tinggi) / 2;

        System.out.print(luas);
    }
}

class Lingkaran {
    void getLuas(int jari) {
        if (jari % 7 == 0) {
            double hitungLuas = 22 / 7 * jari * jari;
            int luas = (int) hitungLuas;
            System.out.print((double) luas);
        } else {
            double hitungLuas = 3.14 * jari * jari;
            int luas = (int) hitungLuas;
            System.out.print((double) luas);
        }

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();

        int sisi, alas, tinggi, jari2;
        int pilihan = in.nextInt();

        if (pilihan == 1) {
            sisi = in.nextInt();
            persegi.getLuas(sisi);

        } else if (pilihan == 2) {
            alas = in.nextInt();
            tinggi = in.nextInt();

            segitiga.getLuas(alas, tinggi);

        } else if (pilihan == 3) {
            jari2 = in.nextInt();
            lingkaran.getLuas(jari2);
        } else {
            System.out.print("Input yang anda masukan tidak sesuai");
        }

    }
}