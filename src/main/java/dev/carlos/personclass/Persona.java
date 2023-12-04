package dev.carlos.personclass;

public class Persona {
    String name;
    String lastName;
    int document;
    int birthdate;

    public Persona(String name, String lastName, int document, int birthdate) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.birthdate = birthdate;
    }

    public void printData() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Número de documento: " + document);
        System.out.println("Año de nacimiento: " + birthdate);
    }
}
