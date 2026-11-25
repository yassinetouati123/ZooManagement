public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Felin", "Lion", 5, true);
        Zoo myZoo = new Zoo("Belvedere", "Tunis", 25);

        System.out.println(lion.name + " / " + myZoo.name + " (" + myZoo.city + ")");
    }
}
