package Jobsheet3.LatihanPraktikum;
import java.util.Scanner;
public class bangunRuangmain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    limas[] arrayLimas = new limas[3];
    kerucut[] arrayKerucut = new kerucut[3];
    bola[] arrayBola = new bola[3];
    
    for (int i = 0; i < 3; i++) {
        arrayLimas[i] = new limas();
        arrayKerucut[i] = new kerucut();
        arrayBola[i] = new bola();
    }

    for (int i = 0; i < 3; i++) {
        if (i == 0) {
            System.out.println("Perhitungan Kerucut");
            System.out.print("Masukkan jari-jari alas kerucut: ");
            arrayKerucut[i].jariJari = sc.nextDouble();
            System.out.print("Masukkan sisi miring kerucut: ");
            arrayKerucut[i].sisiMiring = sc.nextDouble();
        } else if (i == 1) {
            System.out.println("\nPerhitungan Limas");
            System.out.print("Masukkan panjang sisi alas: ");
            arrayLimas[i].panjangSisiAlas = sc.nextDouble();
            System.out.print("Masukkan tinggi: ");
            arrayLimas[i].tinggi = sc.nextDouble();   
        } else if (i == 2) {
            System.out.println("\nPerhitungan Bola");
            System.out.print("Masukkan jari-jari bola: ");
            arrayBola[i].jariJariBola = sc.nextDouble();
        }
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Luas permukaan kerucut: "+ arrayKerucut[i].hitungLuasPermukaan());
                System.out.println("Volume kerucut: "+ arrayKerucut[i].hitungVolume());
            } else if (i == 1) {
                System.out.println("\nLuas permukaan limas: "+ arrayLimas[i].hitungLuasPermukaan());
                System.out.println("Volume kerucut: "+ arrayLimas[i].hitungVolume());
            } else if (i == 2) {
                System.out.println("\nLuas permukaan bola: "+ arrayBola[i].hitungLuasPermukaan());
                System.out.println("Volume bola: "+ arrayBola[i].hitungVolume());
            }
        }
    }
}