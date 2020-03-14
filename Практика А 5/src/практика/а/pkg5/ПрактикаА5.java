////PrA-5-1
////Задать массив оценок студентов для группы численностью 20 человек. Выполнить поиск
////максимальной оценки в группе и вывести ее на консоль. 
//
//package практика.а.pkg5;
//
//public class ПрактикаА5 {
//
//    public static void main(String[] args) {
//        int marks[] = new int[20];
//        int m = marks[0];
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = (int) (Math.random() * 10);
//            System.out.print(marks[i] + " ");
//            if (i == 19) {
//                System.out.println("");
//            }
//            if (m < marks[i]) {
//                m = marks[i];
//            }
//        }
//        System.out.println("Максимальная оценка группы = " + m);
//    }
//}
//
//PrA-5-2
//Измените программу PrA-5-1, чтобы вывести не саму оценку, а ее номер.
//Замечание: максимальных оценок может быть несколько. 
//
//package практика.а.pkg5;
//
//public class ПрактикаА5 {
//
//    public static void main(String[] args) {
//        int marks[] = new int[20];
//        int m = marks[0];
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = (int) (Math.random() * 10);
//            System.out.print(marks[i] + " ");
//            if (i == 19) {
//                System.out.println("");
//            }
//            if (m < marks[i]) {
//                m = marks[i];
//            }
//        }
//        for (int j = 0; j < marks.length; j++) {
//            if (m == marks[j]) {
//                System.out.println("Номер элемента с max значением в массиве: " + j);
//            }
//        }
//    }
//}
//
//PrA-5-3
//Напишите программу для сортировки элементов целочисленного массива по возрастанию. 
//package практика.а.pkg5;
//
//public class ПрактикаА5 {
//
//    public static void main(String[] args) {
//        int marks[] = new int[20];
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = (int) (Math.random() * 10);
//        }
//        for (int i = 0; i < marks.length; i++) {
//            int m = i;
//            for (int j = i; j < marks.length; j++) {
//                if (marks[m] > marks[j]) {
//                    m = j;
//                }
//            }
//            int t = marks[m];
//            marks[m] = marks[i];
//            marks[i] = t;
//        System.out.print(t + " ");
//        }
//    }
//}
//
//PrA-5-4
//Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова
//распечатать.
//Замечание: при переворачивании запрещено создавать еще один массив. 
//
package практика.а.pkg5;

public class ПрактикаА5 {

    public static void main(String[] args) {
        int marks[] = new int[20];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10);
            System.out.print(marks[i] + " ");
            if (i == 19) {
                System.out.println("");
            }
        }
        int a = marks.length;
        int b;
        for (int i = 0; i < a / 2; i++) {
            b = marks[a - i - 1];
            marks[a - i - 1] = marks[i];
            marks[i] = b;
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}