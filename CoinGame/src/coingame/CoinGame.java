//PrA-7-3
//Напишите программу, которая симулирует подбрасывание монетки. Оформить отедльным
//классом и методом. Метод должен возвращать результат подбрасывания монетки. 

package coingame;

class Coin {

    boolean flip() {
        return Math.random() > 0.5 ? true : false;
    }
}

public class CoinGame {

    public static void main(String[] args) {

        Coin c = new Coin();
        int orel = 0;
        int reshka = 0;
        for (int i = 0; i < 10; i++) {
            boolean temp = c.flip();
            if (temp) {
                orel++;
            } else {
                reshka++;
            }
        }
        System.out.println("\"Результат подбрасывания монетки\"");
        System.out.println("Орел выпал " + orel + " раз(-а);" + "\nРешка выпала " + reshka + " раз(-а).");
    }
}
