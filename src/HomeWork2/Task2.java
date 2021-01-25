package HomeWork2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Введите месяц: ");
        int mnthNm = sc.nextInt();
        if (mnthNm >= 1 && mnthNm <= month.length + 1) {
            System.out.print("Введите число месяца: ");
            int dayNm = sc.nextInt();
            String strAns = dayNm <= month[mnthNm - 1] ? "Указанный день существует в указанном месяце." : "Указанный день не существует в указанном месяце.";
            System.out.println(strAns);
        } else {
            System.out.println("Указанный месяц не существует.");
        }
    }
}