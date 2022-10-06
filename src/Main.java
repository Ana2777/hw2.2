import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        var maxim = new Person("Максим", 35, "Минск", "Бренд-менеджер");
        maxim.hi();
        var annya = new Person( "Аня", 29, "Москва", "Методист образовательных программ");
        annya.hi();
        var katya = new Person("Катя", 28, "Калининград", "Продакт менеджер");
        katya.hi();
        var artem = new Person("Артем", 27, "Москва", "Директор по развитию бизнеса");
        artem.hi();
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("Цветы");
        Flower rose = new Flower("Роза", null, "Голландия", 35.59, 0);
        rose.f();
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15.00, 5);
        chrysanthemum.f();
        Flower pioneer = new Flower("Пион", null, "Англия", 69.9, 1);
        pioneer.f();
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        gypsophila.f();
}}