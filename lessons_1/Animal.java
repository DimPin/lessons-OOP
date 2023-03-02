package lessons_1;

public class Animal {
    public String name;
    private String color;
    private int pawsCount;

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public void speak() {
        System.out.println("Yarr!");
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

    @Override
    public String toString() {
        return String.format("Имя: %s, Цвет: %s", name, color);
    }
}
