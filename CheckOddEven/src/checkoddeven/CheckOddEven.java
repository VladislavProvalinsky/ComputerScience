//Pr1-4

//Напишите программу CheckOddEven, которая печатает "Odd Number", если
//целочисленная переменная “number” содержит нечетное значение; и "Even
//Number" – в ином случае.

//Прмечание: n  является четным, если (n % 2) равняется 0.

package checkoddeven;
import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int n;
        n = in.nextInt();
        if (n%2>0)
            System.out.println("Odd Number");
        else 
            System.out.println("Even Number");
    } 
}
