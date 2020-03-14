//PrA2-3
//Разработайте приложение CheckLeapYear. Присвойте значение true булевской
//переменной leapYear если целочисленная переменная year является високосным годом.
//
//Подсказка: в високосном году 366 дней, в обычном 365.
//
//1. Если год не делится на 4, значит он обычный.
//2. Иначе надо проверить не делится ли год на 100.
//3. Если не делится, значит это не столетие и можно сделать вывод, что год
//високосный.
//4. Если делится на 100, значит это столетие, и следует проверить его делимость на
//400.
//5. Если год делится на 400, то он високосный.
//6. Иначе год обычный. 
package checkleapyear;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш год: ");
        boolean leapYear=false;
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 > 0)
            leapYear = true;
        else if (year % 100 == 0 && year % 400 == 0) 
            leapYear = true;
        System.out.println(leapYear);
    }
}
