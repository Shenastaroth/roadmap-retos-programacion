import java.util.stream.IntStream;

public class Shenastaroth {

    //Variable global
    static String global_var = "Hola, soy una variable global";
    //function simple to print "Hola mundo" in the console
    public static void HelloWorld() {
        System.out.println("Hola mundo");
    }

    //function that receives two integers and returns their sum
    public static int exercise (int a, int b) {
        int sum = a + b;
        return sum;
    }

    //function with argumnets
    public static String greet(String name) {
        return "Hola " + name;
    }

    //function that receives an array of strings and returns a string with all the names concatenated
    public static String greetNames(String[] names) {
        String result = "";
        for (String name : names) {
            result += name + " ";
        }
        return result;
    }

    public static void printGlobalVar() {
       System.out.println(global_var);
    }

    //Extra

    static int extra(String texto1, String texto2){
        int [] count = {0};//Debo utilizar un arreglo para poder modificar dentro del Lambda
        IntStream.range(1, 100).forEach(i -> {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(texto1 + "  " + texto2);
            } else if (i % 5 == 0){
                System.out.println(texto2);
            }else if (i % 3 == 0) {
                System.out.println(texto1);
            }else {
                System.out.println(i);
                count[0]++;
            }
        });;
            // Muestra el total en la consola antes de salir de la función
        System.out.println("El total de numeros contados es: " + count[0]);
        return count[0];
    }
    public static void main(String[] args) {
        HelloWorld();
        int result = exercise(5, 10);
        System.out.println("La suma es: " + result);

        String greeting = greet("Shenastaroth");
        System.out.println(greeting);

        String[] names = {"Alice", "Bob", "Charlie"};
        String greetings = greetNames(names);
        System.out.println(greetings);

        printGlobalVar();

        extra("Bienvenido 3", "multiplo de 5");
    }
}