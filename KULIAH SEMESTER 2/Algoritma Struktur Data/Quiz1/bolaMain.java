package Quiz1;
import java.util.Scanner;

public class bolaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Tampil informasi");
        System.out.println("2. Sewa bola");
        System.out.println("3. Keluar program");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                bola.tampilInfo();
                break;
            case 2:
                bola.sewaBola();
                break;
            case 3:
                System.out.println("Terima kasih telah menggunakan program sewa bola");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
