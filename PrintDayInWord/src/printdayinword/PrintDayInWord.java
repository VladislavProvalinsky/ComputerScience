// PrA-3-1
// Разработайте приложение PrintDayInWord, которая печатает «воскресенье»,
// «понедельник», «суббота», если целочисленная переменная day равна 0, 1, ..., 6
// соответственно. В противном случае программа должна напечатать «Недействительный
// день». Используйте конструкцию «вложенные-если».

package printdayinword;

public class PrintDayInWord {
    public static void main(String args[]) {
         int day=3;
         if (day==0)
         System.out.println("Ваш день - воскресенье");
         else if (day==1)
         System.out.println("Ваш день - понедельник");
         else if (day==2)
         System.out.println("Ваш день - вторник");
         else if (day==3)
         System.out.println("Ваш день - среда");
         else if (day==4)
         System.out.println("Ваш день - четверг");
         else if (day==5)
         System.out.println("Ваш день - пятница");
         else if (day==6)
         System.out.println("Ваш день - суббота");
         else
         System.out.println("Недействительный день");
    }
} 