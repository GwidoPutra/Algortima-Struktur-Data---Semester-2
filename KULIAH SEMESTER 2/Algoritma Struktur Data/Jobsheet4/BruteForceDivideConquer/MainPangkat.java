package Jobsheet4.BruteForceDivideConquer;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Perhitungan Pangkat");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int jumlahElemen = sc.nextInt();

        Pangkat[] arrPangkat = new Pangkat[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("---------------");
            System.out.println("Elemen ke-" + (i + 1));
            System.out.print("Masukkan nilai: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan pangkat: ");
            int pangkat = sc.nextInt();

            arrPangkat[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("==============================");
        System.out.println("Menu:");
        System.out.println("1. Pangkat dengan metode Brute Force");
        System.out.println("2. Pangkat dengan metode Divide and Conquer");
        System.out.print("Pilih metode (1/2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hasil pangkat dengan metode Brute Force:");
                for (int i = 0; i < jumlahElemen; i++) {
                    System.out.println("Elemen ke-" + (i + 1) + ": " + arrPangkat[i].pangkatBF());
                }
                break;
            case 2:
                System.out.println("Hasil pangkat dengan metode Divide and Conquer:");
                for (int i = 0; i < jumlahElemen; i++) {
                    System.out.println("Elemen ke-" + (i + 1) + ": " + arrPangkat[i].pangkatDC(arrPangkat[i].nilai, arrPangkat[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan invalid.");
        }
    }
}
