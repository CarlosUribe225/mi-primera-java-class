package dev.carlos.personclass;

public class Persona {
    String name;
    String lastName;
    int document;
    int birthdate;
    String country;
    char gender;

    public Persona(String name, String lastName, int document, int birthdate, String country, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.birthdate = birthdate;
        this.country = country;
        this.gender = gender;
    }

    public void printData() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Número de documento: " + document);
        System.out.println("Año de nacimiento: " + birthdate);
        System.out.println("País de nacimiento: " + country);
        System.out.println("Género: " + gender);
    }
}
