package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entity.Aquatic;
import tn.esprit.gestionzoo.entity.Dolphin;
import tn.esprit.gestionzoo.entity.Penguin;
import tn.esprit.gestionzoo.entity.Terrestrial;

public class Main {
    public static void main(String[] args) {

        Aquatic aquatic = new Aquatic(
                "Fish",
                "Aquatic animal",
                2,
                false,
                "Sea"
        );

        Terrestrial terrestrial = new Terrestrial(
                "Feline",
                "Lion",
                5,
                true,
                4
        );

        Dolphin dolphin = new Dolphin(
                "Cetacean",
                "Dolphin",
                8,
                true,
                "Ocean",
                45.5f
        );

        Penguin penguin = new Penguin(
                "Bird",
                "Penguin",
                4,
                false,
                "Antarctica",
                30.0f
        );

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}