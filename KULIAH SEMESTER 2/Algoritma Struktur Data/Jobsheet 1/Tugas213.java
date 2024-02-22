import java.util.Scanner;

public class Tugas213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Perhitungan Kecepatan");
        System.out.println("2. Perhitungan Jarak");
        System.out.println("3. Perhitungan Waktu");
        System.out.print("Pilih yang ingin anda hitung dari menu : ");
        int menu = sc.nextInt();

        if (menu == 1) {
            kecepatan();
        }
        if (menu == 2) {
            jarak();
        }
        if (menu == 3) {
            waktu();
        }
    }
    
    static  void kecepatan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (km) : ");
        int jarak = sc.nextInt();
        System.out.print("Masukkan waktu (h) :");
        int waktu = sc.nextInt();
        int kecepatan = jarak / waktu;
        System.out.println("Hasil kecepatan (km/h) : " + kecepatan);
    }

    static void jarak(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (km/h) : ");
        int kecepatan = sc.nextInt();
        System.out.print("Masukkan waktu (h) :");
        int waktu = sc.nextInt();
        int jarak = kecepatan * waktu;
        System.out.println("Hasil jarak (km) :  " + jarak);
    }

    static void waktu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (km) : ");
        int jarak = sc.nextInt();
        System.out.print("Masukkan kecepatan (km/h) :");
        int kecepatan = sc.nextInt();
        int waktu = jarak / kecepatan;
        System.out.println("Hasil waktu (h) : " + waktu);
    }
}