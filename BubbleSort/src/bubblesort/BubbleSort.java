//PrB-3-2
//Напишите программу BubbleSort реализующую ”Пузырьковую сортировку”. Алгоритм
//сортировки изучить самостоятельно: https://ru.wikipedia.org/wiki/Сортировка_пузырьком
package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int mas[] = new int[10];
        System.out.print("Массив до сортировки: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int t = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = t;
                }
            }
        }
        System.out.println();
        System.out.print("Массив после пузырьковой сортировки: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
