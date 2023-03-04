package homework_1;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Ivan", "black");
        Duck duck = new Duck("Artem", "white");

        cat.toGo();
        cat.fly();
        cat.swim();
        System.out.println();
        duck.toGo();
        duck.fly();
        duck.swim();
    }
}
