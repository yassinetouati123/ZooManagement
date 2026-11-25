package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entity.Animal;
import tn.esprit.gestionzoo.entity.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Belvedere");

        Animal a1 = new Animal("Felin", "Lion", 5, true);
        Animal a2 = new Animal("Bird", "Eagle", 3, false);

        zoo.addAnimal(a1);
        zoo.addAnimal(a2);

        System.out.println(a1);
        System.out.println(a2);
    }
}