package dev.carlos.personclass;


public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Persona personaF = new Persona("María", "Marín", 54321, 1988, "España", 'F');
        Persona personaM = new Persona("Carlos", "Uribe", 12345, 1989, "Colombia", 'M');
        Persona personaO = new Persona("Juan", "Pérez", 2468, 1987, "Portugal", 'O');

        System.out.println("PersonaF: ");
        personaF.printData();
        System.out.println("");
        System.out.println("PersonaM: ");
        personaM.printData();
        System.out.println("");
        System.out.println("PersonaO: ");
        personaO.printData();
    }


}
