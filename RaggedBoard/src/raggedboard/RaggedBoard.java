//PrA-6-4
//Напишите программу RaggedBoard, которая создает двумерный массив с уступами
//используя два вложенных цикла for.
//1 1 1 1 1 1
//1 1 1 
//1 1 1 1 1 1
//1 1 1
//1 1 1 1 1 1
//1 1 1
//Программа должна выводить сформированный двумерный массив в консоль. 

package raggedboard;

public class RaggedBoard {

    public static void main(String[] args) {
        int mas[][] = new int[6][];
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                mas[i] = new int[3];
            } else {
                mas[i] = new int[6];
            }
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = 1;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
