/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1.pertemuan4;

/**
 *
 * @author ctray
 */
import java.util.Scanner;
public class Soal1Pertemuan4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = scanner.nextInt();

        // Memastikan n >= 1
        if (n < 1) {
            System.out.println("Masukkan nilai n yang valid (n >= 1)");
            return;
        }

        System.out.println("Bilangan dari 1 sampai dengan " + n + " adalah:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
