package Jobsheet7;

import java.util.Scanner;

public class Utama13 {
    public static void main(String[] args) {
        Gudang13 gudang = new Gudang13(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Atur kapasitas gudang");
            System.out.println("6. Tampilkan barang terbawah");
            System.out.println("7. Cari barang dengan nama atau kode");
            System.out.println("8. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang13 barangBaru = new Barang13(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    System.out.println("Masukkan kapasitas barang yang diinginkan: ");
                    int kapasitas = scanner.nextInt();
                    gudang = new Gudang13(kapasitas);
                    break;
                case 6:
                    gudang.lihatBarangTerbawah();
                    break;
                case 7:
                System.out.println("Masukkan nama/kode barang yang dicari: ");
                String search = scanner.nextLine();
                gudang.cariBarang(search);
                break;                    
                case 8:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
                    break;
            }
        }
    }    
}
