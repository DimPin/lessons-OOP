package src.homeowork_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import src.drugs.Component;
import src.drugs.impl.CatDrug;
import src.drugs.impl.components.Azitron;
import src.drugs.impl.components.Pinecilin;
import src.drugs.impl.components.Water;

// Создать сет компонентов, и сделать так, чтобы в нем не было 2 одинаковых. (Специально создать два одинаковых компонента в Main и попытаться их добавить в сет)
// * Set<Component> result = new HashSet<>(components); (подсказка переопределить методы equals и hashCode).
// Переписать compareTo так, чтобы если power лекарств равны, сравнение шло еще и по названиям компонентов лекарства

public class Program {
    public static void main(String[] args) {
        Set<Component> result = new HashSet<>();
        result.add(new Component("Azitron", "10", 100));
        result.add(new Component("Azitron", "10", 100));
        System.out.println(result);

        List<Component> componentCat = List.of(new Azitron("Азитрон", "4", 4), 
            new Azitron("Азитрон", "18", 4));
        List<Component> componentCat2 = List.of(new Pinecilin("Пинецилин", "20", 4), 
            new Pinecilin("Пинецилин", "10", 4));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 4), 
            new Water("Вода", "10", 4));
        
        CatDrug drug = new CatDrug(componentCat);
        CatDrug drug2 = new CatDrug(componentCat2);
        CatDrug drug3 = new CatDrug(componentCat3);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug2);
        drugs.add(drug3);

        Collections.sort(drugs);
        System.out.println(drugs);
    }
}
