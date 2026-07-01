package modelo;

public class PersonaController {
    private String nombre;
    private int edad;

    public PersonaController(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad;
    }
}