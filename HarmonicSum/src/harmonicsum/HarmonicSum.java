//PrA-4-7
//Напишите программу HarmonicSum для вычисления суммы гармонического ряда, как
//показано ниже, где n = 5000. Программа должна вычислять сумму как слева направо, так и
//справа налево. 
package harmonicsum;

public class HarmonicSum {

    public static void main(String[] args) {
        double HarmonicSum1 = 0;
        double HarmonicSum2 = 0;
        for (double i = 1; i <= 5000; i++) {
            HarmonicSum1 = HarmonicSum1 + 1 / i;
        }   
        for (double i = 5000; i >= 1; i--) {
            HarmonicSum2 = HarmonicSum2 + 1 / i;
        }
        System.out.println("The HarmonicSum(LeftRight) is " + HarmonicSum1);
        System.out.println("The HarmonicSum(RightLeft) is " + HarmonicSum2);
    }
}
