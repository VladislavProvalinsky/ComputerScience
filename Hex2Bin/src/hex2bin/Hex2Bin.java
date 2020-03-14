//PrB-31
//
//Напишите программу Hex2Bin для преобразования значения заданного в виде строки в
//шестнадцатеричной системе исчисления в строку в двоичной системе исчисления.
//Результат должен выглядеть так:
//
//Enter a Hexadecimal string: 1abc
//The equivalent binary for hexadecimal "1abc" is 0001 1010 1011 1100 

package hex2bin;

import java.util.Scanner;

public class Hex2Bin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String str = in.next().toUpperCase();
        char b;
        char symbol[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
            "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        System.out.print("The equivalent binary for hexadecimal '"+str+"' is: ");
        for (int i = 0; i < str.length(); i++) {
            b = str.charAt(i);
            for (int j = 0; j < symbol.length; j++) {
                if (b == symbol[j]) {
                    System.out.print(binary[j] + " ");
                }
            }
        }
    }
}
