package Jobsheet3.LatihanPraktikum;

public class dataMhs {
    String nama, jenisKelamin;
    long nim;
    double ipk;
    dataMhs[] arrayDataMhs = new dataMhs[3];

    public dataMhs( String nama, String jenisKelamin, long nim, double ipk) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nim = nim;
        this.ipk = ipk;
    }

    public String hasilNama() {
        return nama;
    }

    public String hasilJenisKelamin() {
        return jenisKelamin;
    }

    public long hasilNim() {
        return nim;
    }

    public double hasilIpk() {
        return ipk;
    }

}
