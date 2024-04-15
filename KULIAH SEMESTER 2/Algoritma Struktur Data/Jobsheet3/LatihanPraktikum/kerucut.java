package Jobsheet3.LatihanPraktikum;

public class kerucut {
    double jariJari;
    double sisiMiring;

    double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari * sisiMiring);
    }

    double hitungVolume() {
        return (1 * 3) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}
