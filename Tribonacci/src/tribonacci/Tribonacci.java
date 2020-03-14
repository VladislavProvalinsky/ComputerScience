//PrB-1-3
//
//Числа Tribonacc представляют собой последовательность чисел T(n), аналогичную числам
//Фибоначчи, за исключением того, что число образуется путем добавления трех
//предыдущих чисел, т.е. T(n) = T(n-1) + T(n-2) + T(n-3), T(1) = T(2) = 1 и T(3) = 2.
//Напишите программу под названием Tribonacci, чтобы воспроизвести первые двадцать
//чисел Трибоначчи. 

package tribonacci;

public class Tribonacci {

    public static void main(String[] args) {
        int T1 = 1;
        int T2 = 1;
        int T3 = 2;
        int T4;
        System.out.println("The first 20 Tribonacci numbers are: ");
        System.out.print(T1 + " " + T2 + " " + T3 + " ");
        for (int i = 4; i <= 20; i++) 
        {
            T4 = T1 + T2 + T3;
            System.out.print(T4 + " ");
            T1 = T2;
            T2 = T3;
            T3 = T4;
        }
        System.out.println();
    }
}
