package Jobsheet4.BruteForceDivideConquer;

public class Faktorial {
    public int nilai;
    
    int faktorialBF(int n) {
        int fakto = 1;
    //     int i = 1;
    //     while (i <= n) {
    //       fakto *= i;
    //       i++;
    //     }
    //     return fakto;
    //   }
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
