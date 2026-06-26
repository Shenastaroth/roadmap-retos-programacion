import java.util.stream.IntStream;

public class Shenastaroth {
    public static void main(String[] args) {

        /*
            Operadores de Comparacion
        */

            System.out.println("Igualdad: 5 == 7 : " + (5 == 7));
            System.out.println("Desigualdad: 5 != 7 : " + (5 != 7));
            System.out.println("Menor que: 5 < 7 : " + (5 < 7));
            System.out.println("Mayor que: 5 > 7 : " + (5 > 7));
            System.out.println("Menor o igual: 5 <= 7 : " + (5 <= 7));
            System.out.println("Mayor o igual: 5 >= 7 : " + (5 >= 7));

        /*
            Operadores Logicos
         */

            System.out.println("AND &&: true && true : " + (12 < 22 && 2 < 8));
            System.out.println("OR || : " + (12 < 22 || 2 > 8));
            System.out.println("NOT: !true : " + (!true));

        /*
         Operadoes de asignacion
        */

         int number = 12;
         System.out.println(number);
         number += 1;//suma y asignacion
         System.out.println(number);
         number -= 1;//resta y asignacion
         System.out.println(number);
         number *= 2; //multiplicacion y asigancion
         System.out.println(number);
         number /= 2; //division y asignacion
         System.out.println(number);
         number %= 2; // modulo y asigancion

         /*
          Operadores de identidad
         */

          int myNumber = number;
          System.out.println("number is myNumber: " + (number == myNumber));

          System.out.println("number is not myNumber: " + (number != myNumber));

          /*
           Operadores de bit
          */

          /*
          AND :  Devuelve 1 en cada posiscion donde amos bits son 1
          OR : Devuelve 1 si al menos uno de los bits es 1
          XOR : devuelve 1 si los bits son diferentes
          NOT : Operador unario que invierte todos los bits(cambia 0 por 1 y viciversa)
          */

           int a = 10;
           int b = 5;
           System.out.println("AND : 10 & 5 = " + (a & b));
           System.out.println("OR : 10 || 5 = " + (a & b));
           System.out.println("XOR : 10 ^ 5 = " + (a ^ b));
           System.out.println("NOT : -10 = " + (-a));
           System.out.println("Desplazamiento a la derecha : 10 >> 2 = " + (a >> 2));
           System.out.println("Desplazamiento a la izquierda : 10 << 2 = " + (a << 2));
           
           /*
            Estructuras de control
           */

           //Condicionales

           String color = "rojo";

           if(color == "rojo") {
            System.out.println("El color es rojo");
           }else {
            System.out.println("El color no es rojo");
           }


           //Iterativas
           for( int i = 0; i <= 10; i++) {
            System.out.println("El valor de i es: " + i);
           }

           //Usando Streams
        //    IntStream.range(0, 11).forEach(i ->
        //     System.out.println("El valor de i es: " + i)
        //    );

        int j = 0;

        while (j <= 10){
            System.out.println("El valor de j es: " + j);
            j++;
        }


        //Manejo de excepciones
        try {
            int division = 10 / 0;
            System.out.println(division);
        }catch (ArithmeticException e) {
            System.out.println("Error: Division por cero no es posible");
        }finally {
            System.out.println("Ha finalizado el manejo de excepciones");
        }

        //Extra

        IntStream.range(10 , 56).forEach(i -> {
            if (i % 2 == 0 && i != 16 && i % 3 != 0) {
                System.out.println("El numero " + i + " es par");
            }
        });
      }
}
