package HomeWork2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер сторон: ");
        int par = sc.nextInt();
        double dblPik = (double) par / 2;
        int pik = (int) Math.round(dblPik);

        int i, k, l;

        for (i = 1; i <= pik; ++i) {
            for (k = 1; k <= pik; ++k) {
                if (k <= i) {
                    System.out.print(" " + k);
                } else {
                    System.out.print(" " + i);
                }
            }

            for (l = par % 2 == 1 ? pik - 1 : pik; l >= 1; --l) {
                if (l >= i) {
                    System.out.print(" " + i);
                } else {
                    System.out.print(" " + l);
                }
            }

            System.out.println();
        }

        for (i = par % 2 == 1 ? pik - 1 : pik; i >= 1; --i) {
            for (k = 1; k <= pik; ++k) {
                if (k <= i) {
                    System.out.print(" " + k);
                } else {
                    System.out.print(" " + i);
                }
            }

            for (l = par % 2 == 1 ? pik - 1 : pik; l >= 1; --l) {
                if (l >= i) {
                    System.out.print(" " + i);
                } else {
                    System.out.print(" " + l);
                }
            }

            System.out.println();
        }
    }
}

