package tn.esprit.gestionzoo.entity;

public class Zoo {

    private String name;
    private static final int nbrCages = 25;

    private Animal[] animals;
    private int nbAnimals;

    private Aquatic[] aquaticAnimals;
    private int nbAquaticAnimals;

    public Zoo() {
        animals = new Animal[nbrCages];
        aquaticAnimals = new Aquatic[10];
        nbAnimals = 0;
        nbAquaticAnimals = 0;
    }

    public Zoo(String name) {
        this.name = name;
        animals = new Animal[nbrCages];
        aquaticAnimals = new Aquatic[10];
        nbAnimals = 0;
        nbAquaticAnimals = 0;
    }

    public boolean isZooFull() {
        return nbAnimals >= nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull()) {
            return false;
        }

        animals[nbAnimals] = animal;
        nbAnimals++;

        return true;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquatic == null) {
            System.out.println("The aquatic animal cannot be null");
            return;
        }

        if (nbAquaticAnimals >= aquaticAnimals.length) {
            System.out.println("The aquatic animals array is full");
            return;
        }

        aquaticAnimals[nbAquaticAnimals] = aquatic;
        nbAquaticAnimals++;
    }

    public void swimAllAquatics() {
        for (int i = 0; i < nbAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maximumDepth = 0;

        for (int i = 0; i < nbAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];

                if (penguin.getSwimmingDepth() > maximumDepth) {
                    maximumDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maximumDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }

    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");

        for (int i = 0; i < nbAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public void displayAquaticAnimals() {
        System.out.println("Aquatic animals in " + name + ":");

        for (int i = 0; i < nbAquaticAnimals; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int position = searchAnimal(animal);

        if (position == -1) {
            return false;
        }

        for (int i = position; i < nbAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbAnimals - 1] = null;
        nbAnimals--;

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }

    public int getNbAquaticAnimals() {
        return nbAquaticAnimals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", nbAnimals=" + nbAnimals +
                ", nbAquaticAnimals=" + nbAquaticAnimals +
                '}';
    }
}