package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entity.Dolphin;
import tn.esprit.gestionzoo.entity.InvalidAgeException;
import tn.esprit.gestionzoo.entity.Penguin;
import tn.esprit.gestionzoo.entity.Terrestrial;
import tn.esprit.gestionzoo.entity.Zoo;
import tn.esprit.gestionzoo.entity.ZooFullException;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Belvedere");

        try {
            Terrestrial lion = new Terrestrial(
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

            Terrestrial elephant = new Terrestrial(
                    "Elephantidae",
                    "Elephant",
                    15,
                    true,
                    4
            );

            zoo.addAquaticAnimal(dolphin);
            zoo.addAquaticAnimal(penguin);

            /*
             * The zoo has only three cages.
             * The first three additions will work.
             */
            zoo.addAnimal(lion);
            zoo.addAnimal(dolphin);
            zoo.addAnimal(penguin);

            /*
             * This fourth addition throws ZooFullException.
             */
            zoo.addAnimal(elephant);

        } catch (InvalidAgeException exception) {
            System.out.println(
                    "InvalidAgeException: " + exception.getMessage()
            );

        } catch (ZooFullException exception) {
            System.out.println(
                    "ZooFullException: " + exception.getMessage()
            );
        }

        System.out.println(
                "\nFinal number of animals: " + zoo.getNbAnimals()
        );

        System.out.println("\nAnimals currently in the zoo:");
        zoo.displayAnimals();

        System.out.println("\nAquatic animals swimming:");
        zoo.swimAllAquatics();

        System.out.println(
                "\nMaximum penguin swimming depth: "
                        + zoo.maxPenguinSwimmingDepth()
        );

        zoo.displayNumberOfAquaticsByType();

        /*
         * Separate test for a negative age.
         */
        try {
            Penguin invalidPenguin = new Penguin(
                    "Bird",
                    "Invalid Penguin",
                    -4,
                    false,
                    "Antarctica",
                    25.0f
            );

            zoo.addAnimal(invalidPenguin);

        } catch (InvalidAgeException exception) {
            System.out.println(
                    "\nInvalidAgeException: "
                            + exception.getMessage()
            );

        } catch (ZooFullException exception) {
            System.out.println(
                    "\nZooFullException: "
                            + exception.getMessage()
            );
        }
    }
}