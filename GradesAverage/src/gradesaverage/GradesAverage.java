//PrB-2-3
//Напишите программу под названием GradesAverage, которая запрашивает у пользователя
//количество учеников, читает их с клавиатуры и сохраняет в переменной int, называемой
//numStudents. Затем он запрашивает у пользователей оценки каждого из учеников и
//сохраняет их в массиве int, называемом классами. Ваша программа должна проверить, что
//оценка составляет от 0 до 100. Пример сеанса следующий:
//
//Enter the number of students: 3
//Enter the grade for student 1: 55
//Enter the grade for student 2: 108
//Invalid grade, try again...
//Enter the grade for student 2: 56
//Enter the grade for student 3: 57
//The average is 56.0
package gradesaverage;

import java.util.Scanner;

public class GradesAverage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество учеников класса: ");
        int numStudents = in.nextInt();
        int sum = 0;
        double average;
        int marks[] = new int[numStudents];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Введите оценку ученика " + (i + 1) + ": ");
            int mark = in.nextInt();
            if (mark >= 0 && mark <= 100) {
                marks[i] = mark;
                sum += mark;
            } else {
                i--;
                System.out.println("Неверная оценка, попробуйте ещё раз...");
            }
        }
        average = (double) sum / numStudents;
        System.out.println("Средняя оценка учеников: " + average);
    }
}
