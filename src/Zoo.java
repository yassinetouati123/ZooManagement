public class Zoo {

    Animal[] animals;
    String name;
    String city;
    final int NBR_CAGES = 25;
    int nbAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

    boolean isZooFull() {
        return nbAnimals >= NBR_CAGES;
    }

    boolean addAnimal(Animal animal) {
        if (nbAnimals >= NBR_CAGES) {
            return false;
        }
        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
    }

    static Zoo compareZoo(Zoo z1, Zoo z2) {
        return z1.nbAnimals >= z2.nbAnimals ? z1 : z2;
    }
}
