import java.util.Scanner;

public class Perulangan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input NIM : ");
        long nim = sc.nextLong();
        long n = nim % 10;
            if (n < 10) {
            n += 10;
        }

        System.out.print("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}