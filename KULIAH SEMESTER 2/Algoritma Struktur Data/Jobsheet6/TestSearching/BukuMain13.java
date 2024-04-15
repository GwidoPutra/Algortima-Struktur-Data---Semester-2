package Jobsheet6.TestSearching;

import java.util.Scanner;

public class BukuMain13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku13 data = new PencarianBuku13();
        int jumBuku = 5;

        System.out.println("------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kodebuku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------------------");
            System.out.print("Kode buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit= s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang= s1.nextLine();
            System.out.print("Stock     \t : ");
            int stock= s.nextInt();
            Buku13 m = new Buku13(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambahBuku(m);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Data keseluruhan mahasiswa: ");

        System.out.println("-----------------------------------------------------");
        System.out.println("Data keseluruhan buku: ");
        data.tampil();

        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.println("Kode buku: ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("=========================");
        System.out.println("menggunakan binary Search");
        posisi = data. FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        Buku13 dataBuku= data.findBuku(cari);
        dataBuku.tampilDataBuku();
    }
}
