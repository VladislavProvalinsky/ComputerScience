//PrA2-1
//Если символьная переменная taxCode содержит значение ‘T’, увеличьте цену на процент,
//указанный в целочисленной переменной taxRate;
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char taxCode = 'T';
        System.out.print("Введите ваш процент: ");
        double taxRate;
        taxRate = in.nextDouble();
        System.out.print("Введите вашу цену: ");
        double price;
        price = in.nextDouble();
        if (taxCode == 'T') {
            price = price + price * (taxRate / 100);
        }
        System.out.println("Новая цена: " + price);
    }

}
