//PrB-1-2
//
//Напишите программу Fibonacci для отображения первых 20 чисел Фибоначчи F(n), где
//F(n) = F(n-1) + F(n-2) и F(1) = F(2) = 1. Также вычислите их среднее значение. Результат
//должен выглядеть так:
//
//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5 
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int F1 = 1;
        int F2 = 1;
        int F3;
        double average;
        int sum=F1+F2;
        int count=0;
        System.out.println("The first 20 Fibonacci numbers are: ");
        System.out.print(F1 + " " + F2 + " ");
        for (int i = 3; i <= 20; i++) 
        {
            F3 = F1 + F2;
            sum+=F3;
            count=i;
            System.out.print(F3 + " ");
            F1 = F2;
            F2 = F3;
        }
        System.out.println();
        average = (double) sum/count;
        System.out.println("The average is: " + average);
    }
}
