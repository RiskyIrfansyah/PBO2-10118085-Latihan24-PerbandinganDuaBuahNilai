/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Risky Irfansyah
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Program : Perbandingan Dua Buah Nilai
 */
public class PBO210118085Latihan24PerbandinganDuaBuahNilai {
    public static int satu, dua, hasil;
    public static String status;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
        
        System.out.println("======= Program Perbandingan Nilai =======");
        System.out.print("Masukan Nilai Pertama : ");
        satu = scanner.nextInt();
        System.out.print("Masukan Nilai Kedua : ");
        dua = scanner.nextInt();
        if (satu > dua)
            status = " Lebih Besar Dari ";
        else if (satu < dua)
            status = " Kurang Dari ";
        else
            status = " Sama Dengan ";
        System.out.println("Hasil " + satu + status + dua);
        System.out.println("Ulangi Aktivitas ? [Ya/Tidak : ]");
        } while (scanner.next().equals("Ya"));
    }
}
