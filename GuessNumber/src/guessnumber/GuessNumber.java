//PrB-3-3
//Написать игру GuessNumber ("Угадай число"). Программа генерирует и запоминает
//некоторое число в диапазоне от 1 до 100. Игрок пытается его угадать - выбирает
//очередное значение из указанного диапазона. Если значение меньше заданного, то
//выводится подсказка "LOWER", если же больше - то "HIGHER". Игра продолжается, пока
//игрок не угадает число.
//В конце игры программа выводит сообщение о завершении и количество попыток,
//которое понадобилось, чтобы угадать число. Предлагается повторить игру с самого
//начала. 
package guessnumber;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = (int) (Math.random() * 100);
        int n = 0;
        int i = 0;
        System.out.print("Введите загаданное число: ");
        while (i >= 0) {
            i++;
            int a = in.nextInt();
            if (a > num) {
                n += 1;
                System.out.print("Higher ");
                System.out.print("Попробуйте еще раз: ");
                i--;
            } else if (a < num) {
                n += 1;
                System.out.print("Lower ");
                System.out.print("Попробуйте еще раз: ");
                i--;
            } else {
                n += 1;
                System.out.println("Вы угадали!" + "\nВаше число: " + a + "\nКоличество использованных попыток: " + n);
                System.out.print("Желаете повторить игру? (1-да/0-нет): ");
                int game = in.nextInt();
                if (game == 1) {
                    i--;
                    num = (int) (Math.random() * 100);
                    System.out.print("Введите загаданное число: ");
                } else if (game == 0) {
                    System.out.print("Спасибо за игру! До встречи.");
                    break;
                }
            }
        }
    }
}
