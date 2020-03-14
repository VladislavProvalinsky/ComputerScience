//PrB-2-2
//
//На клавиатуре вашего телефона алфавит отображается на цифры следующим образом:
//ABC (2), DEF (3), GHI (4), JKL (5), MNO (6), PQRS (7), TUV (8), WXYZ (9).
//
//Напишите программу PhoneKeyPad, которая запрашивает у пользователя строку String
//(без учета регистра) и преобразует в последовательность цифр клавиатуры. Используйте
//вложенный-if (или switch-case) в этом упражнении.
//
//Совет: Вы можете использовать in.next().toLowerCase(), чтобы прочитать строку и
//преобразовать ее в нижний регистр.

package phonekeypad;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");
        String str = in.nextLine().toUpperCase();
        int num[] = {2, 3, 4, 5, 6, 7, 8, 9};
        String keypad[] = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        char s1, s2, s3, s4, s5, s6;
        for (int i = 0; i < str.length(); i++) {
            s1 = str.charAt(i);
            for (int j = 0; j < keypad.length; j++) {
                s2 = keypad[j].charAt(0);
                s3 = keypad[j].charAt(1);
                s4 = keypad[j].charAt(2);
                s5 = keypad[5].charAt(3);
                s6 = keypad[7].charAt(3);
                if (s1 == s2 || s1 == s3 || s1 == s4) {
                    System.out.print(num[j] + " ");
                } else if (s1 == s5) {
                    System.out.print(num[5] + " ");
                } else if (s1 == s6) {
                    System.out.print(num[7] + " ");
                }
            }
            if (s1 == ' ') {
                System.out.print("| ");
            }
        }
    }
}
//            
//            if (symbol == ' ') {
//                System.out.print("| ");
//            } else if (symbol == 'A' || symbol == 'B' || symbol == 'C') {
//                System.out.print("2 ");
//            } else if (symbol == 'D' || symbol == 'E' || symbol == 'F') {
//                System.out.print("3 ");
//            } else if (symbol == 'G' || symbol == 'H' || symbol == 'I') {
//                System.out.print("4 ");
//            } else if (symbol == 'J' || symbol == 'K' || symbol == 'L') {
//                System.out.print("5 ");
//            } else if (symbol == 'M' || symbol == 'N' || symbol == 'O') {
//                System.out.print("6 ");
//            } else if (symbol == 'P' || symbol == 'Q' || symbol == 'R' || symbol == 'S') {
//                System.out.print("7 ");
//            } else if (symbol == 'T' || symbol == 'U' || symbol == 'V') {
//                System.out.print("8 ");
//            } else if (symbol == 'W' || symbol == 'X' || symbol == 'Y' || symbol == 'Z') {
//                System.out.print("9 ");
//            }
//        }
//    }
//}
