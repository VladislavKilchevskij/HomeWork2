package HomeWork2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Загадайте число от 0 до 100 : ");
        int yrNum = sc.nextByte();
        int i = 1;

        while(true) {
            int rndNum = (int) (Math.random() * 101);
            if (rndNum == yrNum) {
                System.out.println(rndNum);
                System.out.println("Ура! Ты угадал моё число: " + yrNum + ".");
                System.out.println("Количество попыток: " + i + ".");
                return;
            }
            ++i;
        }
    }
}