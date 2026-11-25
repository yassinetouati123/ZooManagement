package tn.esprit.gestionzoo.entity;

public class Terrestrial extends Animal implements Omnivore<Food> {

    protected int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age,
                       boolean isMammal, int nbrLegs)
            throws InvalidAgeException {

        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " (terrestrial) is eating meat");
        } else {
            System.out.println(name + " (terrestrial) cannot eat " + meat + " as meat");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " (terrestrial) is eating plants");
        } else {
            System.out.println(name + " (terrestrial) cannot eat " + plant + " as plant");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " (terrestrial) is eating plants and meat");
        } else {
            System.out.println(name + " (terrestrial) needs BOTH to eat plants and meat, not " + food);
        }
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", nbrLegs=" + nbrLegs +
                '}';
    }
}