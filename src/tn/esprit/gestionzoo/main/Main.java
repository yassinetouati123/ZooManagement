package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entity.Dolphin;
import tn.esprit.gestionzoo.entity.Penguin;
import tn.esprit.gestionzoo.entity.Terrestrial;
import tn.esprit.gestionzoo.entity.Zoo;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Belvedere");

        Terrestrial lion = new Terrestrial(
                "Feline",
                "Lion",
                5,
                true,
                4
        );

        Dolphin dolphin1 = new Dolphin(
                "Cetacean",
                "Dolphin One",
                8,
                true,
                "Ocean",
                45.5f
        );

        Dolphin dolphin2 = new Dolphin(
                "Cetacean",
                "Dolphin Two",
                6,
                true,
                "Sea",
                40.0f
        );

        Penguin penguin1 = new Penguin(
                "Bird",
                "Penguin One",
                4,
                false,
                "Antarctica",
                30.0f
        );

        Penguin penguin2 = new Penguin(
                "Bird",
                "Penguin Two",
                5,
                false,
                "Antarctica",
                42.5f
        );

        zoo.addAnimal(lion);
        zoo.addAnimal(dolphin1);
        zoo.addAnimal(dolphin2);
        zoo.addAnimal(penguin1);
        zoo.addAnimal(penguin2);

        zoo.addAquaticAnimal(dolphin1);
        zoo.addAquaticAnimal(dolphin2);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);

        System.out.println(zoo);

        System.out.println("\nAll animals:");
        zoo.displayAnimals();

        System.out.println("\nAquatic animals:");
        zoo.displayAquaticAnimals();

        System.out.println("\nSwimming:");
        zoo.swimAllAquatics();

        System.out.println(
                "\nMaximum penguin swimming depth: "
                        + zoo.maxPenguinSwimmingDepth()
        );

        System.out.println("\nAquatic animals by type:");
        zoo.displayNumberOfAquaticsByType();

        Penguin penguin3 = new Penguin(
                "Another family",
                "Penguin One",
                4,
                true,
                "Antarctica",
                100.0f
        );

        System.out.println(
                "\nAre penguin1 and penguin3 equal? "
                        + penguin1.equals(penguin3)
        );
    }
}