//PrA-7-1
//Создать класс космического корабля с двумя полями и двумя методами. На базе класса
//построить два объекта космического корабля. 
package spaceship;

class Ships {

    String Name;
    String Commander;

    void characteristics(int length, int width, int maxspeed) {
        System.out.println("Длина корабля (метров): " + length);
        System.out.println("Ширина корабля (метров): " + width);
        System.out.println("Максимальная скорость корабля (парсек/мин): " + maxspeed);
    }

    void direction(String planet) {
        System.out.println("Двигается в направлении планеты: " + planet);
    }
}

public class Spaceship {

    public static void main (String[] args) {
        Ships ship1 = new Ships();
        ship1.Name = "\"Звезда смерти\"";
        ship1.Commander = "Дарт Вейдер";
        System.out.println("Название первого корабля: " + ship1.Name);
        System.out.println("Командир первого корабля: " + ship1.Commander);
        ship1.characteristics(1000, 1000, 50);
        ship1.direction("Татуин");
        System.out.println();
        Ships ship2 = new Ships();
        ship2.Name = "\"Сокол Бесконечности\"";
        ship2.Commander = "Люк Скайуокер";
        System.out.println("Название второго корабля: " + ship2.Name);
        System.out.println("Командир второго корабля: " + ship2.Commander);
        ship2.characteristics(100, 40, 100);
        ship2.direction("Кашиик");
    }
}
