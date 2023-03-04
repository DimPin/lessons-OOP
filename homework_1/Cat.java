package homework_1;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void fly() {
        System.out.println("Разбегается, подпрыгивает и падает на пол...");
    }

    @Override
    public void swim() {
        System.out.println("Бултыхется в воде...");
    }
}
