package Jobsheet5.LatihanPraktikum;

public class Hotel {
    public static Hotel[] length;
    String nama, kota;
    int harga;
    byte bintang;

    Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("kota: " + kota);
        System.out.println("harga: " + harga);
        System.out.println("bintang: " + bintang);
    }
}
