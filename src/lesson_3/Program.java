package src.lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import src.drugs.Component;
import src.drugs.impl.CatDrug;
import src.drugs.impl.components.Azitron;
import src.drugs.impl.components.Pinecilin;
import src.drugs.impl.components.Water;

public class Program {
    public static void main(String[] args) {
        List<Component> componentsCat = List.of(new Azitron("Азитрон", "2", 4), 
            new Water("Вода", "15", 1));
        CatDrug catDrug = new CatDrug(componentsCat);
        for (Component component : catDrug) {
            System.out.println(component);
        }

        List<Component> componentCat = List.of(new Azitron("Азитрон", "4", 4), 
            new Pinecilin("Пинецилин", "18", 6));
        List<Component> componentCat2 = List.of(new Water("Вода", "20", 12), 
            new Azitron("Азитрон", "10", 9));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12), 
            new Azitron("Азитрон", "10", 100));
        
        CatDrug drug = new CatDrug(componentCat);
        CatDrug drug2 = new CatDrug(componentCat2);
        CatDrug drug3 = new CatDrug(componentCat3);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug2);
        drugs.add(drug3);
        // System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);
    }
}
