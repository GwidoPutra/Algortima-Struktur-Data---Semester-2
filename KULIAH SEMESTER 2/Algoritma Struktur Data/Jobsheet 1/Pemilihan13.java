import java.util.Scanner;

public class Pemilihan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.print("Masukkan nilai Tugas : ");
        float Tugas = sc.nextFloat();

        System.out.print("Masukkan nilai Kuis : ");
        float Kuis = sc.nextFloat();

        System.out.print("Masukkan nilai UTS : ");
        float UTS = sc.nextFloat();

        System.out.print("Masukkan nilai UAS : ");
        float UAS = sc.nextFloat();

        System.out.println("=======================");
        System.out.println("=======================");

        boolean nilaiTidakValid = false;
        if (Tugas < 0 || Tugas > 100) {
            nilaiTidakValid = true;
        }
        if (Kuis < 0 || Kuis > 100) {
            nilaiTidakValid = true;
        }
        if (UTS < 0 || UTS > 100) {
            nilaiTidakValid = true;
        }
        if (UAS < 0 || UAS > 100) {
            nilaiTidakValid = true;
        }

        if (nilaiTidakValid) {
            System.out.println("Nilai tidak valid");
        } else {
            float total = (Tugas * 0.2F) + (Kuis * 0.2F) + (UTS * 0.3F) + (UAS * 0.3F);

            String nilaiHuruf;
            if (total > 80) {
                nilaiHuruf = "A";
            } else if (total > 73) {
                nilaiHuruf = "B+";
            } else if (total > 65) {
                nilaiHuruf = "B";
            } else if (total > 60) {
                nilaiHuruf = "C+";
            } else if (total > 50 ) {
                nilaiHuruf = "C";
            } else if (total > 39){
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Nilai akhir: " + total);
            System.out.println("Nilai huruf: " + nilaiHuruf);

            System.out.println("=======================");
            System.out.println("=======================");

            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||  nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("MOHON MAAF ANDA GAGAL");
            }
        }
    }
}
