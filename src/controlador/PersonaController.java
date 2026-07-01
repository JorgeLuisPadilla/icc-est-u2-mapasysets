package controlador;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import modelo.Persona;

public class PersonaController {

    //Primer método: Filtrar y ordenar personas por edad mínima y nombre
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadMinima) {
    Set<Persona> personasFiltradas = new TreeSet<>(new Comparator<Persona>() {

        @Override
        public int compare(Persona p1, Persona p2) {

            // Unicidad lógica
            if (p1.getNombre().equalsIgnoreCase(p2.getNombre())
                    && p1.getEdad() == p2.getEdad()) {
                return 0;
            }

            // Edad descendente
            if (p1.getEdad() != p2.getEdad()) {
                return p2.getEdad() - p1.getEdad();
            }

            // Nombre ascendente ignorando mayúsculas
            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        }
    });

    for (Persona persona : personas) {
        if (persona.getEdad() >= edadMinima) {
            personasFiltradas.add(persona);
        }
    }

    return personasFiltradas;
    }


    public Map<String, List<String>> agruparPorRangoEdad(List<Persona> personas) {

        Map<String, List<String>> mapa = new TreeMap<>();

        mapa.put("ADULTO", new ArrayList<>());
        mapa.put("JOVEN", new ArrayList<>());
        mapa.put("MAYOR", new ArrayList<>());

        for (Persona persona : personas) {

            String grupo;

            if (persona.getEdad() < 30) {
                grupo = "JOVEN";
            } else if (persona.getEdad() < 60) {
                grupo = "ADULTO";
            } else {
                grupo = "MAYOR";
            }

            String primerNombre = persona.getNombre().split(" ")[0];

            List<String> lista = mapa.get(grupo);

            boolean existe = false;

            for (String nombre : lista) {
                if (nombre.equalsIgnoreCase(primerNombre)) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                lista.add(primerNombre);
            }
        }

        return mapa;
    }
}

