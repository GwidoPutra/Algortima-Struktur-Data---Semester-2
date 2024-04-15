package Quiz1;
import java.util.Scanner;

public class bola {
    public static String[] jenisBolaList = {"Futsal", "Voli", "Basket", "Tenis"};
    public static String[] merkBolaList = {"Nike", "Adidas", "Reebok"};
    public static int[] hargaSewaList = {7500, 5000, 10000, 5000};
    public static int[] stokList = {10, 10, 10, 10};

    public bola() {
    }

    static void tampilInfo() {
        System.out.println("Jenis bola: " + jenisBolaList[0]);
        for (int i = 0; i < jenisBolaList.length; i++) {
            System.out.println((i + 1) + ". " + jenisBolaList[i]);
        }
        System.out.println("Merk bola:");
        for (int i = 0; i < merkBolaList.length; i++) {
            System.out.println((i + 1) + ". " + merkBolaList[i]);
        }
        System.out.println("Harga sewa per jam:");
        for (int i = 0; i < hargaSewaList.length; i++) {
            System.out.println((i + 1) + ". Rp" + hargaSewaList[i]);
        }
        System.out.println("Stok bola tersedia: ");
        for (int i = 0; i < stokList.length; i++) {
            System.out.println((i + 1) + ". " + stokList[i]);
        }
    }

    static void sewaBola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih jenis bola:");
        for (int i = 0; i < jenisBolaList.length; i++) {
            System.out.println((i + 1) + ". " + jenisBolaList[i]);
        }
        int pilihanJenisBola = sc.nextInt() - 1;
        if (pilihanJenisBola < 0 || pilihanJenisBola >= jenisBolaList.length) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        System.out.println("Pilih merk bola:");
        for (int i = 0; i < merkBolaList.length; i++) {
            System.out.println((i + 1) + ". " + merkBolaList[i]);
        }
        int pilihanMerkBola = sc.nextInt() - 1;
        if (pilihanMerkBola < 0 || pilihanMerkBola >= merkBolaList.length) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        int hargaSewa = hargaSewaList[pilihanJenisBola];
        System.out.print("Masukkan lama waktu sewa (jam): ");
        int lamaSewa = sc.nextInt();
        System.out.println("Anda menyewa bola " + jenisBolaList[pilihanJenisBola] + " merk " + merkBolaList[pilihanMerkBola] + " selama " + lamaSewa + " jam.");
        System.out.println("Total harga sewa: Rp" + (lamaSewa * hargaSewa));
    }
    static void ubahStok(int index, int stokBaru) {
        stokList[index] += stokBaru;
        System.out.println("Stok " + jenisBolaList[index] + " diupdate: " + stokList[index]);
    }
}
