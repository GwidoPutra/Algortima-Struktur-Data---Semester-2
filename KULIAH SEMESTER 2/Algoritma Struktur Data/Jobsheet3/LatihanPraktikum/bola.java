package Jobsheet3.LatihanPraktikum;

public class bola {
    double jariJariBola;

    double hitungVolume() {
        double volume = 0;
        volume = (4.0 * 3.0) * Math.PI * Math.pow(jariJariBola, 3);
        return volume;
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 0;
        luasPermukaan = 4 * Math.PI * Math.pow(jariJariBola, 2);
        return luasPermukaan;
    }

}
