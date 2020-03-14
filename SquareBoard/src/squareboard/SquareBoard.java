//PrA-6-1
//Напишите программу SquareBoard, которая создает массив-матрицу nxn (n=5) все
//элементы которой установлены в значение 1 используя два вложенных цикла for. 
//1 1 1 1 1
//1 1 1 1 1
//1 1 1 1 1
//1 1 1 1 1
//1 1 1 1 1
//Программа должна выводить сформированную матрицу в консоль. 

package squareboard;

public class SquareBoard {

    public static void main(String[] args) {
        int Mas[][] = new int[5][5];
        for (int i = 0; i < Mas.length; i++) {
            for (int j = 0; j < Mas[i].length; j++) {
                Mas[i][j] = 1;
                System.out.print(Mas[i][j]+" ");
            }
            System.out.println();
        }
    }
}
