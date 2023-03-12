package src.drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    private List<Component> components;
    int index;

    public Drug(List<Component> components) {
        this.components = components;
        this.index = 0;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Drug o) {
        int power = getDrugPower();
        String name = getDrugName();
        if (power != o.getDrugPower()) {
            return Integer.compare(power, o.getDrugPower());
        } else {
            if (name.toLowerCase().charAt(0) == o.getDrugName().toLowerCase().charAt(0)) {
                return 0;
            } else if (name.toLowerCase().charAt(0) == 'а' &&
                    o.getDrugName().toLowerCase().charAt(0) != 'а') {
                return -1;
            } else if (name.toLowerCase().charAt(0) == 'п' &&
                    o.getDrugName().toLowerCase().charAt(0) != 'п') {
                return 1;
            } else if (name.toLowerCase().charAt(0) == 'в' &&
                    o.getDrugName().toLowerCase().charAt(0) == 'п') {
                return -1;
            } else if (name.toLowerCase().charAt(0) == 'в' &&
                    o.getDrugName().toLowerCase().charAt(0) == 'а') {
                return 1;
            } else {
                return 1;
            }
        }
    }

    public int getDrugPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    public String getDrugName() {
        String name = components.get(index).getName();
        return name;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n",
                this.getClass().getSimpleName(),
                components, getDrugPower());
    }
}
