public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", 35, "Минск", "Бренд-менеджер");
        maxim.hi();
        Person annya = new Person("Аня", 29, "Москва", "Методист образовательных программ");
        annya.hi();
        Person katya = new Person("Катя", 28, "Калининград", "Продакт менеджер");
        katya.hi();
        Person artem = new Person("Артем", 27, "Москва", "Директор по развитию бизнеса");
        artem.hi();
    }
}