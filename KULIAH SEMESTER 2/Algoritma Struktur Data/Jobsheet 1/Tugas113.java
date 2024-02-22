import java.util.Scanner;

public class Tugas113 {

    static Scanner sc = new Scanner(System.in);
    static char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'K', 'L', 'M'};
    static char [][] KOTA = new char [10][12];

    public static void main(String[] args) {

        System.out.print("KODE Plat: A, B, D, E, F, G, H, L, N, T");
        KOTA();
        do{
            System.out.println("\n Input KODE plat: ");
            int input = sc.next().charAt(0);
            switch (input) {
                case 'A':
                    KODEPlat(0);
                    break;
                case 'B':
                    KODEPlat(1);
                    break;
                case 'D':
                    KODEPlat(2);
                    break;
                case 'E':
                    KODEPlat(3);
                    break;
                case 'F':
                    KODEPlat(4);
                    break;
                case 'G':
                    KODEPlat(5);
                    break;
                case 'H':
                    KODEPlat(7);
                    break;
                case 'L':
                    KODEPlat(8);
                    break;
                case 'N':
                    KODEPlat(9);
                    break;
                default:
                System.out.println("KODE tidak valid");
                    break;
            }
        }while(true);
    }

    static void KODEPlat(int index){
        for (int i=0; i < KOTA[index].length ;i++){
            System.out.print(KOTA[index][i]);
        }
    }

    static void KOTA(){

        char[][]KOTATemp={
        {'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E','K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T','E', 'G', 'A', 'L'}
        };

        for (int i = 0;i<KOTA.length;i++){
            for (int j =0;j<KOTATemp[i].length;j++){
                KOTA[i][j] = KOTATemp[i][j];
            }
        }
    }
}
