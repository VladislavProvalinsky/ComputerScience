//PrA-6-3
//Напишите программу CheckerBoard, которая создает массив-матрицу nxn (n=8) используя
//два вложенных цикла for.
//1 0 1 0 1 0 1 0
//0 1 0 1 0 1 0 1
//1 0 1 0 1 0 1 0
//0 1 0 1 0 1 0 1
//1 0 1 0 1 0 1 0
//0 1 0 1 0 1 0 1
//1 0 1 0 1 0 1 0
//0 1 0 1 0 1 0 1
//Программа должна выводить сформированную матрицу в консоль. 
package checkerboard;

public class CheckerBoard {

    public static void main(String[] args) {
        int mas[][] = new int[8][8];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = 0;
                }
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
