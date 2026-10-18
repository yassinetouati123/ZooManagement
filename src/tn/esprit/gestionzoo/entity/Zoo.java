package tn.esprit.gestionzoo.entity;

public class Zoo {

    private String name;
    private static final int nbrCages = 25;
    private Animal[] animals;
    private int nbAnimals;

    public Zoo(String name) {
        setName(name);
        animals = new Animal[nbrCages];
        nbAnimals = 0;
    }

    public boolean isZooFull() {
        return nbAnimals >= nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            return false;
        }

        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }
}