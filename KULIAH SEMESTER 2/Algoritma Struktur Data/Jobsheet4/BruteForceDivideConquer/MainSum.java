package Jobsheet4.BruteForceDivideConquer;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         System.out.println("==============================");
//         System.out.println("Program menghitung keuntungan total (satuan juta. Misal 5.9)");
//         System.out.print("Masukkan jumlah perusahaan: ");
//         int jumlahPerusahaan = sc.nextInt();

//         Sum[] sm = new Sum[jumlahPerusahaan];

//         for (int i = 0; i < jumlahPerusahaan; i++) {
//             System.out.println("===============================");
//             System.out.print("Masukkan jumlah bulan untuk Perusahaan " + (i + 1) + ": ");
//             int elm = sc.nextInt();
//             sm[i] = new Sum(elm);

//             for (int j = 0; j < sm[i].elemen; j++) {
//                 System.out.print("Masukkan untung bulan ke-" + (j + 1) + " untuk Perusahaan " + (i + 1) + ": ");
//                 sm[i].keuntungan[j] = sc.nextDouble();
//             }
//         }

//         System.out.println("==============================");
//         for (int i = 0; i < jumlahPerusahaan; i++) {
//             System.out.println("Perusahaan " + (i + 1));
//             System.out.println("==============================");
//             System.out.println("Algoritma Brute Force");
//             System.out.println("Total keuntungan selama " + sm[i].elemen + " bulan adalah " + sm[i].totalBF(sm[i].keuntungan));
//             System.out.println("==============================");
//             System.out.println("Algoritma Divide and Conquer");
//             System.out.println("Total keuntungan selama " + sm[i].elemen + " bulan adalah " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
//         }
//     }
// }

        System.out.println("==============================");
        System.out.println("Program menghitung keuntungan total (satuan juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("===============================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke- "+ (i + 1) +" = ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("==============================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah "+ sm.totalBF(sm.keuntungan));
        System.out.println("==============================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah "+ sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }
}
