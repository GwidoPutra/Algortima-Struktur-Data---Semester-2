package Jobsheet3;

public class dataMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[][] dataMahasiswa = new Mahasiswa[2][2];

        dataMahasiswa[0][0] = new Mahasiswa();
        dataMahasiswa[0][0].nama = "Gwido";
        dataMahasiswa[0][0].absen = 13;
        dataMahasiswa[0][0].status = "Mahasiswa";
        dataMahasiswa[0][1] = new Mahasiswa();
        dataMahasiswa[0][1].nama = "Aditya Atadewa";
        dataMahasiswa[0][1].absen = 3;
        dataMahasiswa[0][1].status = "Ketua kelas";


        System.out.println("Nama: "+ dataMahasiswa[0][0].nama +"\nNomor absen:  "+ dataMahasiswa[0][0].absen +"\nstatus: "+ dataMahasiswa[0][0].status);
        System.out.println("\nNama: "+ dataMahasiswa[0][1].nama +"\nNomor absen:  "+ dataMahasiswa[0][1].absen +"\nstatus: "+ dataMahasiswa[0][1].status);

    }
}
