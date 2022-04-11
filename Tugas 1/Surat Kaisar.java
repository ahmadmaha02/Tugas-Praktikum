import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);

        String plaintext = sc.nextLine();

        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for (int i = 0; i < plaintext.length(); i++) {

            alphabet = plaintext.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {

                alphabet = (char) (alphabet + shift);

                if (alphabet > 'z') {

                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            }

            else if (alphabet >= 'A' && alphabet <= 'Z') {

                alphabet = (char) (alphabet + shift);

                if (alphabet > 'Z') {

                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else {
                ciphertext = ciphertext + alphabet;
            }

        }
        System.out.println(ciphertext);
    }
}