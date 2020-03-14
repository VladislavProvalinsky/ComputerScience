//PrA-7-2
//Дополнить класс калькулятора операциями вычитания, умножения и деления для двух
//операндов. Добавить метод изменения знака целочисленного значения на
//противоположный. Добавить методы поиска минимального и максимального значения в
//переданных в качестве параметра массивах. 
package calculator;

class Calc {

    int addition(int a, int b) {
        int res = a + b;
        System.out.println("Калькулятор суммы: " + res);
        return res;
    }

    int minus(int a, int b) {
        int res = a - b;
        System.out.println("Калькулятор разности: " + res);
        return res;
    }

    int mult(int a, int b) {
        int res = a * b;
        System.out.println("Калькулятор умножения: " + res);
        return res;
    }

    double division(double a, double b) {
        double res = a / b;
        System.out.println("Калькулятор деления: " + res);
        return res;
    }

    int addAny(int ar[]) {
        int sum = 0;
        for (int item : ar) {
            sum += item;
        }
        System.out.println("Калькулятор суммы эл-в массива: " + sum);
        return sum;
    }

    int changeSymb(int a, int b) {
        int res = -(a * b);
        System.out.println("Калькулятор замены знака результата: " + res);
        return res;
    }

    int countSymb(String str) {
        System.out.println("Калькулятор суммы эл-в строки: " + str.length());
        return str.length();
    }

    int minValue(int ar[]) {
        System.out.println("\nКалькулятор поиска минимального элемента массива");
        System.out.print("Случайный массив: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100);
            System.out.print(ar[i] + " ");
        }
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println("\nМинимальное значение массива: " + min);
        return min;
    }

    int maxValue(int ar[]) {
        System.out.println("\nКалькулятор поиска максимального элемента массива");
        System.out.print("Случайный массив: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100);
            System.out.print(ar[i] + " ");
        }        
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        System.out.println("\nМаксимальное значение массива: " + max);
        return max;
    }
}

public class Calculator {

    public static void main(String[] args) {
        long tBegin = System.currentTimeMillis();
        Calc c = new Calc();
        int addition = c.addition(3, 7);
        int minus = c.minus(45, 17);
        int mult = c.mult(3, 7);
        double division = c.division(33, 12);
        int p[] = {3, 5, 7, 9, 11};
        int addAny = c.addAny(p);
        int countSymb = c.countSymb("Hello World!!!");
        int changeSymb = c.changeSymb(3, 7);        
        int a[] = new int[10];
        int minValue = c.minValue(a);
        int b[] = new int[10];
        int maxValue = c.maxValue(b);
        long tEnd = System.currentTimeMillis();
        System.out.println("\nTime: " + (tEnd-tBegin));
    }
}