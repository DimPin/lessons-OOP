package lessons_1;

public class Dog extends Animal {
    public Dog (String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
