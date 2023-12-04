package dev.carlos.personclass;


public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", "Uribe", 12345, 1989);
        Persona persona2 = new Persona("Andrés", "Bermúdez", 54321, 1988);

        System.out.println("Persona1: ");
        persona1.printData();
        System.out.println("");
        System.out.println("Persona2: ");
        persona2.printData();
    }


}
