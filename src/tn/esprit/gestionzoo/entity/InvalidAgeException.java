package tn.esprit.gestionzoo.entity;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Animal age cannot be negative");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}