//Pr1-3
//
//Напишите программу CheckPassFail, которая печатает "PASS", если
//целочисленная переменная “mark” больше или равна 50; и "FAIL" – в ином
//случае.
package checkpassfail;
import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше значение: ");
        int mark;
        mark = in.nextInt();
        if (mark>=50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }
}
