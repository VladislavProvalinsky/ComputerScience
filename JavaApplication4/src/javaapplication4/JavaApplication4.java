//PrA2-2
//Если целочисленная переменная currentNumber содержит нечетное значение, увеличьте ее
//значение в три раза + 1, иначе уменьшите значение currentNumber в два раза. 
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int currentNumber;
        currentNumber = in.nextInt();
        if (currentNumber % 2 > 0) {
            currentNumber = currentNumber * 3 + 1;
        } else {
            currentNumber = currentNumber / 2;
        }
        System.out.println("Ваше новое число: " + currentNumber);
    }

}
