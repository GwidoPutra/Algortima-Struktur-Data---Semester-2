package Jobsheet4.BruteForceDivideConquer.LatihanPraktikum;

public class Mobil {
    String merk, tipe;
    int tahun;
    double topAcceleration, topPower;

    public Mobil(String merk, String tipe, int tahun, double topAcceleration, double topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public static double akselMaks(Mobil[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double leftMax = akselMaks(data, low, mid);
            double rightMax = akselMaks(data, mid + 1, high);
            return Math.max(leftMax, rightMax);
        }
    }

    public static double akselMin(Mobil[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double leftMin = akselMin(data, low, mid);
            double rightMin = akselMin(data, mid + 1, high);
            return Math.min(leftMin, rightMin);
        }
    }

    public static double rataTopPower(Mobil[] data) {
        double totalPower = 0;
        for (Mobil mobil : data) {
            totalPower += mobil.topPower;
        }
        return totalPower / data.length;
    }
}
