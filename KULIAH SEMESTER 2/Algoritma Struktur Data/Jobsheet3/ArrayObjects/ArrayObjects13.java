package Jobsheet3.ArrayObjects;
import java.util.Scanner;

public class ArrayObjects13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak persegi panjang yang diinginkan: ");
        int n = sc.nextInt();
        PersegiPanjang13[] ppArray = new PersegiPanjang13[n];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang13();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke-" +i);
            System.out.println("Panjang: "+ ppArray[i].panjang +", lebar: "+ ppArray[i].lebar);
        }
    }
}