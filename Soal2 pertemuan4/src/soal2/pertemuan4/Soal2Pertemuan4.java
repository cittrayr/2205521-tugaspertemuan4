/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2.pertemuan4;

/**
 *
 * @author ctray
 */
import java.util.Scanner;
public class Soal2Pertemuan4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input batasAwal
        System.out.print("Masukkan batasAwal: ");
        int batasAwal = scanner.nextInt();

        // Membaca input batasAkhir
        System.out.print("Masukkan batasAkhir: ");
        int batasAkhir = scanner.nextInt();

        // Memastikan batasAwal lebih kecil dari atau sama dengan batasAkhir
        if (batasAwal > batasAkhir) {
            System.out.println("Masukkan batasAwal yang lebih kecil dari batasAkhir.");
            return;
        }

        // Menghitung banyaknya bilangan ganjil
        int banyakGanjil = hitungBanyakGanjil(batasAwal, batasAkhir);

        // Menampilkan hasil
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah: " + banyakGanjil);
    }

    // Fungsi untuk menghitung banyaknya bilangan ganjil
    public static int hitungBanyakGanjil(int batasAwal, int batasAkhir) {
        int count = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
