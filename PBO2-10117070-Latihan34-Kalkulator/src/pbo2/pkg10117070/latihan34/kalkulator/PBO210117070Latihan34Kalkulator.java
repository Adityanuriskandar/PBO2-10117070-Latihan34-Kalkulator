/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author Aditya 
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program Perhitungan Kalkulator
 */
public class PBO210117070Latihan34Kalkulator {

    public static void main(String[] args) {
        Kalkulator klt = new Kalkulator();
        Scanner scn = new Scanner(System.in);

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan angka ke-1 : ");
        Double value1 = scn.nextDouble();
        System.out.print("Masukkan angka ke-2 : ");
        Double value2 = scn.nextDouble();
        System.out.println();
        System.out.println("Hasil Pertambahan : " + klt.tambahBilangan(value1, value2));
        System.out.println("Hasil Pengurangan : " + klt.kurangBilangan(value1, value2));
        System.out.println("Hasil Perkalian : " + klt.kaliBilangan(value1, value2));
        System.out.println("Hasil Pembagian : " + klt.bagiBilangan(value1, value2));
        System.out.println("Hasil Sisa Pembagian : " + klt.sisaBilangan(value1, value2));
    }

}
