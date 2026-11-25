package tn.esprit.gestionzoo.entity;

import java.util.Objects;

public abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age,
                   boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() +
                ", habitat='" + habitat + '\'';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Aquatic)) {
            return false;
        }

        Aquatic aquatic = (Aquatic) obj;

        return age == aquatic.age
                && Objects.equals(name, aquatic.name)
                && Objects.equals(habitat, aquatic.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, habitat);
    }
}