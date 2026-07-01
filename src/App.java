import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import controlador.PersonaController;
import modelo.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Andrés Molina",21));
        personas.add(new Persona("andres molina",21));
        personas.add(new Persona("Sofía Romero",29));
        personas.add(new Persona("sofia romero",29));
        personas.add(new Persona("Miguel Castro",34));
        personas.add(new Persona("miguel castro",34));
        personas.add(new Persona("Valentina Ruiz",41));
        personas.add(new Persona("VALENTINA RUIZ",41));
        personas.add(new Persona("Daniel Vega",55));
        personas.add(new Persona("daniel vega",55));
        personas.add(new Persona("Camila Ortiz",63));
        personas.add(new Persona("camila ortiz",63));
        personas.add(new Persona("Sebastián León",70));
        personas.add(new Persona("Sebastian Leon",70));


        PersonaController pc = new PersonaController();

        System.out.println("************** Metodo A **************");
        
        System.out.println("Filtrando y ordenando personas con edad mínima de 30 años:");

        Set<Persona> personasFiltradas = pc.filtrarYOrdenar(personas, 30);
        for (Persona persona : personasFiltradas) {
            System.out.println(persona);
        }

        System.out.println("\n************** Metodo B **************");
        System.out.println("Agrupando personas por rango de edad:");

        Map<String, List<String>> personasAgrupadas = pc.agruparPorRangoEdad(personas);
        for (Map.Entry<String, List<String>> entry : personasAgrupadas.entrySet()) {
            String rangoEdad = entry.getKey();
            List<String> nombres = entry.getValue();

            System.out.println(rangoEdad + ": " + nombres);
        }
    }
}
