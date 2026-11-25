public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Felin", "Lion", 5, true);
        Zoo z1 = new Zoo("Belvedere", "Tunis");
        Zoo z2 = new Zoo("Friguia", "Sousse");

        z1.addAnimal(lion);

        System.out.println("Zoo full: " + z1.isZooFull());
        System.out.println("Biggest zoo: " + Zoo.compareZoo(z1, z2).name);
    }
}
