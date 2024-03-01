/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3.pertemuan4;

/**
 *
 * @author ctray
 */
import java.util.Scanner;
public class Soal3Pertemuan4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        // Memastikan n >= 0
        if (n < 0) {
            System.out.println("Masukkan nilai n yang valid (n >= 0)");
            return;
        }

        // Menghitung nilai faktorial n
        int faktorial = hitungFaktorial(n);

        // Menampilkan hasil
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print("*");
            }
        }
        System.out.println(" = " + faktorial);
    }

    // Fungsi untuk menghitung nilai faktorial dari n
    public static int hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
