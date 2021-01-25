package HomeWork2;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько часов в сутках? ");
        System.out.println("Помни у тебя всего 3 попытки!");

        byte answNm = 24;
        int i = 3;

        while (i >= 1) {
            System.out.println("Будешь отвечать? (нет: 'n', да: 'y')");
            String strEnd = sc.next();
            if (Objects.equals(strEnd, "n")) {
                System.out.println("Правильный ответ: " + answNm + ".");
                break;
            }

            byte tryNm = sc.nextByte();
            if (tryNm == answNm) {
                System.out.println("Верно.");
                break;
            }

            --i;
            String strCont = i == 0 ? "Ты проиграл(а) :(." : "Осталось попыток: " + i + ".";
            System.out.println(strCont);
        }
    }
}