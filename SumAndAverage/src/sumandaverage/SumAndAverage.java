// PrA-4-1
// Напишите программу SumAndAverage для расчета суммы чисел 1, 2, 3, ... и до 100. Также
// программа должна рассчитать среднее арифметическое. Используйте целочисленную
// переменную, с именем “count”, чтобы подсчитать числа в указанном диапазоне.
// Вывод должен выглядеть следующим образом:
// The sum is 5050
// The average is 50.5
// Измените программу, чтобы использовать цикл «while» вместо цикла «for».

//package sumandaverage;
//
//public class SumAndAverage {
//    public static void main(String args[]) {
//        int count=0;
//        int sum=0;
//        double average;
//        for (int i=1;i<=100;i++){
//            sum=sum+i;
//            count=i;
//        }
//        System.out.println("The sum is " + sum);
//        average = (double) sum/count;
//        System.out.println("The average is " + average);
//    }
//}

//public class SumAndAverage {
//    public static void main(String args[]) {
//        int i=0;
//        int count=0;
//        int sum=0;
//        double average;
//        while (i<100){
//            i++;
//            sum=sum+i;
//            count=i;
//        }
//        System.out.println("The sum is " + sum);
//        average = (double) sum/count;
//        System.out.println("The average is " + average);
//    }
//}

//PrA-4-2
//Измените программу PrA-3-1 для расчета суммы от 111 до 8899 и вычислите среднее
//значение. 

//package sumandaverage;
//
//public class SumAndAverage {
//    public static void main(String args[]) {
//        int count=0;
//        int sum=0;
//        int x=0;
//        double average;
//        for (int i=111;i<=8899;i++){
//            sum=sum+i;
//            x++;
//            count=x;
//        }
//        System.out.println("The sum is " + sum);
//        average = (double) sum/count;
//        System.out.println("The average is " + average);
//    }
//}

//PrA-4-3
//Измените программу PrA-3-1, чтобы найти «сумму квадратов» всех чисел от 1 до 100, т.е.
//1 * 1 + 2 * 2 + 3 * 3 + ... + 100 * 100. 

//package sumandaverage;
//
//public class SumAndAverage {
//    public static void main(String args[]) {
//        int sum=0;
//        int x;
//        for (int i=1;i<=100;i++){
//            x=i*i;
//            sum=sum+x;
//        }
//        System.out.println("The sum is " + sum);
//    }
//}
//
//PrA-4-4
//Измените программу PrA-3-1, чтобы суммировать нечетные числа от 1 до 100 и вычислить
//среднее арифметическое значение. (Подсказка: n - нечетное число, если n%2 не равно 0.)
//
//package sumandaverage;
//
//public class SumAndAverage {
//    public static void main(String args[]) {
//        int count=0;
//        int sum=0;
//        int n=0;
//        double average;
//        for (int i=1;i<=100;i++){
//            if (i%2>0)
//            {
//                count++;
//                n=i;
//                sum=sum+n;
//            }
//        }
//        System.out.println("The sum is " + sum);
//        average = (double) sum/count;
//        System.out.println("The average is " + average);
//    }
//}

//PrA-4-5
//Измените программу PrA-3-1, чтобы суммировать числа от 1 до 100, которые делятся на 7,
//и вычислите среднее арифметическое значение. 

package sumandaverage;

public class SumAndAverage {
    public static void main(String args[]) {
        int count=0;
        int sum=0;
        int n=0;
        double average;
        for (int i=1;i<=100;i++){
            if (i%7==0)
            {
                count++;
                n=i;
                sum=sum+n;
            }
        }
        System.out.println("The sum is " + sum);
        average = (double) sum/count;
        System.out.println("The average is " + average);
    }
}

