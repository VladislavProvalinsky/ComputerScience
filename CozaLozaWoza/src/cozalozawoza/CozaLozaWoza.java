//PrB-1-1
//
//Напишите программу под названием CozaLozaWoza, которая печатает цифры от 1 до 110,
//по 11 цифр в строке. Программа должна печатать «Coza» вместо чисел, кратных 3, «Лоза»
//- для кратных 5, «Woza» - для кратных 7, «CozaLoza» - для кратных 3 и 5 и т.д. Результат
//должен выглядеть так:
//
//1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza 
package cozalozawoza;

public class CozaLozaWoza {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 110; i++) {
            boolean x = true;
            if (i % 3 == 0) 
            {
                System.out.print("Coza");
                x = false;
            }
            if (i % 5 == 0) 
            {
                System.out.print("Loza");
                x = false;
            }
            if (i % 7 == 0) 
            {
                System.out.print("Woza");
                x = false;
            }
            if (x) 
            {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println("");
            }
        }
    }
}