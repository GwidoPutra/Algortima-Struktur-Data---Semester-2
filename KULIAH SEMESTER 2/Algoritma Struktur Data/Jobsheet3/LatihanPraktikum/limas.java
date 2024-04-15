package Jobsheet3.LatihanPraktikum;

public class limas {
    double panjangSisiAlas;
    double tinggi;

    public double hitungLuasPermukaan() {
        double luasPermukaan = 0;
        luasPermukaan = (panjangSisiAlas * panjangSisiAlas) + (4 * (1 / 2) * panjangSisiAlas * tinggi);
        return luasPermukaan;
    }

    public double hitungVolume() {
        double volume = 0;
        volume = (1 / 3) * panjangSisiAlas * panjangSisiAlas * tinggi;
        return volume;
    }
}
