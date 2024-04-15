package Jobsheet3.LatihanPraktikum;
import java.util.Scanner;
public class dataMhsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataMhs[] arrayMhs = new dataMhs[3];

        for (int i = 0; i < arrayMhs.length; i++) {
            System.out.println("Data mahasiswa ke-"+ (i+1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan nim: ");
            long nim = sc .nextLong();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            arrayMhs[i] = new dataMhs(nama, jenisKelamin, nim, ipk);
        }

        for (dataMhs x : arrayMhs) {
            System.out.println("Nama: "+ x.hasilNama());
            System.out.println("Jenis kelamin: "+ x.hasilJenisKelamin());
            System.out.println("Nim: "+ x.hasilJenisKelamin());
            System.out.println("IPK: "+ x.hasilIpk());
        }

    }
       
}
