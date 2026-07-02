## Gestión y Agrupación de Personas
# Información del estudiante
    Nombre: Jorge Luis Padilla
    Carrera: Computación
    Asignatura: Estructura de Datos
    Tema: Colecciones en Java (List, Set, Map, TreeSet, TreeMap)
    Profesor: Pablo Torres
# Método 1: filtrarYOrdenar

## Explicacion

    El metodo filtrarYOrdenar recibe una lista de personas y una edad minima. Su funcion es filtrar solamente las personas que cuya edad sea mayor o igual a la indicada hay que almacenarlas en un TreeSet, tambien se utilizo un TreeSet porque permite mantener los elementos ordenados automáticamente y evitar la existencia de duplicados. Para definir el orden y la unicidad de los objetos se implementó un Comparador.

# Método 2: agruparPorRangoEdad

## Explicacion

    Se utilizo TreeSet<Persona> porque elimina duplicados automaticamente y mantiene el orden. Recorre la lista de personas y determina a qué grupo pertenece cada una según su edad.Luego obtiene solo el primer nombre de cada persona.Finalmente, agrega ese nombre al grupo correspondiente solo si no está repetido, y devuelve el mapa con los resultados.


# Salida en terminal
![alt text](<assets/Captura de pantalla 2026-06-30 215010.png>)