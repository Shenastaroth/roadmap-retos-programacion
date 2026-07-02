import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Shenastaroth {
    static Scanner scanner = new Scanner(System.in);

    //Extra
    static void myAgenda () {

        boolean bucle = true;
        Map<String, Long> agenda = new HashMap<>();

        while (bucle) {
        System.out.println("Agenda");
        System.out.println("1. Buscar contactos");
        System.out.println("2. Añadir contactro");
        System.out.println("3. Actualizar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Listar contactos");
        System.out.println("6. Salir");
        System.out.println("\nElija una opcion: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        switch (option) {
            case 1:
                System.out.println("Buscar Contacto: ");
                String Searchname = scanner.nextLine();
              
                if (agenda.containsKey(Searchname)) {
                    long Searchphone = agenda.get(Searchname);
                    System.out.println("El numero de contacto es: " + Searchphone);
                }else {
                    System.out.println("El contacto no existe");
                }
                break;
            case 2:
                System.out.println("Añade un contacto: ");
                String name = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Digite el telefono: ");
                long phone = scanner.nextInt();
                scanner.nextLine();

                if (String.valueOf(phone).length() != 10) {
                    System.out.println("El telefono debe tener 10 digitos");
                    continue;
                }else {
                    System.out.println("Contacto añadido correctamente");
                    agenda.put(name, phone);
                }
                break;
            case 3:
                System.out.println("Ingrese el nombre del Contacto a actualizar");
                String nameUpdate = scanner.nextLine();
                scanner.next();

                if (agenda.containsKey(nameUpdate)) {
                    System.out.println("Contacto encontrado. Ingrese nuevo telefono");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Error: El telefono debe ser un numero");
                        scanner.next();
                    }
                    long newPhone = scanner.nextInt();
                    scanner.nextLine();

                    agenda.put(nameUpdate, newPhone);
                    System.out.println("Contacto, " + nameUpdate + "es: " + newPhone);
                }else {
                    System.out.println("El contacto no existe");
                }
                break;
            case 4:
                System.out.println("Ingrese nombre del contacto a eliminar");
                String nameDelete = scanner.nextLine();
                scanner.next();
                if (agenda.containsKey(nameDelete)) {
                    agenda.remove(nameDelete);
                    System.out.println("El contacto: " + nameDelete + " ha sido eliminado");
                }else {
                    System.out.println("El contacto a eliminar no existe");
                }
                break;
            case 5:
                if (agenda.isEmpty()) {
                    System.out.println("La agenda esta vacia");
                }else{
                    System.out.println("**** Lista de Contactos *****");

                    agenda.entrySet().stream().forEach(
                        c -> System.out.println("Nombre: " + c.getKey() + "| Telefono: " + c.getValue()));

                        System.out.println();
                }

                break;
            case 6:
                System.out.println("Salir");
                bucle = false;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
    
    record Persona(String nombre, int edad, String email) {}
    //Definimos la tupla
    record Personaje(String nombre, int nivel, boolean esActivo) {}

    public static void main(String [] args) {
        //Arrays
        String [] my_list = {"Brais", "Black", "Riven", "Sage"};
        String newName = "Miss Fortune";

        //Para mostrar el array por terminar hay que utilizar Arrays.toString()
        System.out.println(Arrays.toString(my_list));

        my_list = Arrays.copyOf(my_list, my_list.length + 1);

        my_list[my_list.length - 1 ] = newName;
        
        System.out.println(Arrays.toString(my_list));

        System.out.println(my_list[2]);


        //Listas

        List<String> my_list2 = new ArrayList<>(List.of("Shen", "Soraka", "Darius", "Mokai"));

        my_list2.add("Nafiri");//Insersion
        System.out.println(my_list2);

        my_list2.remove("Shen");//Eliminacion
        System.out.println(my_list2);

        System.out.println(my_list2.get(3));

        my_list2.set(2, "Omen");//Actualizacion

        System.out.println(my_list2);

        my_list2.sort(null);//Ordenacion

        System.out.println(my_list2);

        //Tuplas
        //Creamos la tupla
        Personaje heroe = new Personaje(" Mundo", 17, true);

        System.out.println(heroe);

        //Lista de tuplas
        List<Personaje> listaTupla = List.of(
            new Personaje("Lux", 20, true),
            new Personaje("Ahri", 10, false),
            new Personaje("Galio", 12, true)
        );

        //Recorremos la lista con Streams
        listaTupla.forEach(System.out::println);


        //Sets, el set no permite duplicados

        //Crear un set
        Set<String> personajes = new HashSet<>();
        
        //Agregamos con add
        personajes.add("Fer");
        personajes.add("Bren");
        personajes.add("Kuro");
        personajes.add("GAD");

        personajes.remove("Fer");

        //intetemos agregar un duplicado
        personajes.add("Bren");

        System.out.println(personajes);
        System.out.println();
        System.out.println();

        //Diccionario

        // 1. Creamos el diccionario: <TipoDeClave, TipoDeValor>
        Map<String, Integer> dic = new HashMap<>();

        //Guardar datos usando .put

        dic.put("Darius", 100);
        dic.put("Akali", 50);
        dic.put("Fortune", 200);

        System.out.println(dic);

        dic.put("Darius", 25);

        System.out.println(dic);

        //Buscamos el valor de una clave especifica usando .get(clave)

        int nivel = dic.get("Akali");

        System.out.println("El nivel de Akali es: " + nivel);


        //Extra

        myAgenda();
    }
}