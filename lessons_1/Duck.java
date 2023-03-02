package lessons_1;

public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    public void fly() {
        System.out.println("fly...");
    }
}
