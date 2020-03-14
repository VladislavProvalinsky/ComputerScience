//PrA-6-2
//Напишите программу ColumnBoard, которая создает массив-матрицу nxn (n=8) используя
//два вложенных цикла for.
//1 0 1 0 1 0 1 0
//1 0 1 0 1 0 1 0
//1 0 1 0 1 0 1 0
//1 0 1 0 1 0 1 0
//1 0 1 0 1 0 1 0
//1 0 1 0 1 0 1 0
//1 0 1 0 1 0 1 0
//1 0 1 0 1 0 1 0
//Программа должна выводить сформированную матрицу в консоль. 

package columnboard;

public class ColumnBoard {

    public static void main(String[] args) {
        int mas[][] = new int[8][8];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j % 2 == 0) {
                    mas[i][j] = 1;
                    System.out.print(mas[i][j] + " ");
                }
                else {
                    mas [i][j]=0;
                    System.out.print(mas[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
