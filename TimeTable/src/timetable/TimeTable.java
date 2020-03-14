//PrB-2-1
//Напишите программу TimeTable для вывода таблицы умножения от 1 до 9, как показано
//ниже. Используйте два вложенных цикла for:
//* | 1 2 3 4 5 6 7 8 9
//-------------------------------
// 1 | 1 2 3 4 5 6 7 8 9
// 2 | 2 4 6 8 10 12 14 16 18
// 3 | 3 6 9 12 15 18 21 24 27
// 4 | 4 8 12 16 20 24 28 32 36
// 5 | 5 10 15 20 25 30 35 40 45
// 6 | 6 12 18 24 30 36 42 48 54
// 7 | 7 14 21 28 35 42 49 56 63
// 8 | 8 16 24 32 40 48 56 64 72
// 9 | 9 18 27 36 45 54 63 72 81
//Доработайте код программы, чтобы она распчатывала таблцу умножения от 1 до 12.
package timetable;

public class TimeTable {

    public static void main(String[] args) {
        int str [] = new int[13];
        System.out.print("*| ");
        for (int x=1;x<13;x++){
            str [x]=x;
            System.out.print(str[x]+ " ");
            if (x%12 == 0) 
                    System.out.println(" ");
        }
        System.out.println("-------------------------------");
        int num[] = new int[13];
        for (int i = 1; i < num.length; i++) {
            num[i] = i;
            System.out.print(num[i] + "| ");
            for (int j = 1; j < num.length; j++) {
                num[i] = i * j;
                System.out.print(num[i] + " ");
                if (j%12 == 0) 
                    System.out.println(" ");
                }
            }
        }
    }

