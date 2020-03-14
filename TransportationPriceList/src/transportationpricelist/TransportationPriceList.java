//PrA2-4
//
//Разработайте приложение TransportationPriceList. Присвойте значение вещественной
//переменной cost в зависимости от значения целочисленной переменной distance согласно
//таблице ниже:
//Distance                                                Cost
//-----------------------------------------------------------
//От 0 до 100                                             5.00
//От 100 до 500                                           8.00
//От 500 до 1000                                          10.00
//1000 и больше                                           12.00 
package transportationpricelist;

import java.util.Scanner;

public class TransportationPriceList {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Введите нужную дистанцию: ");
        double cost = 0;
        int distance = name.nextInt();
        if (distance >= 0 && distance < 100)
            cost = 5;
        else if (distance >= 100 && distance < 500)
            cost = 8;
        else if (distance >= 500 && distance < 1000)
            cost = 10;
        else if (distance >= 1000)
            cost = 12;
        System.out.println("Ваша цена: "+cost+" $");
    }
}
