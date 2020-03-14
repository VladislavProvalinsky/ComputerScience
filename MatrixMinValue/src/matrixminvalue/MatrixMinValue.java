//PrB-4-2
//В заданной матрице размерности MxN найти минимальное значение. 

package matrixminvalue;

class Matrix {

    int MinValueMatrix(int mas[][]) {
        int min = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (min > mas[i][j]) {
                    min = mas[i][j];
                }
            }
        }
        return min;
    }
}

public class MatrixMinValue {

    public static void main(String[] args) {
        Matrix minValue = new Matrix();
        int a[][] = new int[7][7];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int temp = minValue.MinValueMatrix(a);
        System.out.println("Миннимальное значение массива: " + temp);
    }
}
