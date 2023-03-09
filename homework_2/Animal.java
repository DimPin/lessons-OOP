package homework_2;

public abstract class Animal {
    public String name;
    private String color;
    private int pawsCount;
    public static int animalsCount = 0;

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        animalsCount++;
    }

    public Animal(String name, int pawsCount) {
        this(name, null, pawsCount);
        animalsCount++;
    }

    public Animal(String name, String color) {
        this(name, color, 0);
        animalsCount++;
    }

    public Animal(String name) {
        this(name, null, 0);
        animalsCount++;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    // lesson-2

    public abstract void speak();

    public abstract void hunt();

    public static int getAnimalsCount() {
        return animalsCount;
    }

    // lesson-2

    @Override
    public String toString() {
        return String.format("Имя: %s, Цвет: %s", name, color);
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}
