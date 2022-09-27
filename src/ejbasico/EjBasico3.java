package ejbasico;

import java.util.Scanner;

public class EjBasico3 {
    public static void main(String[] args) {

        //Declaramos el Scanner para poder leer por consola
        Scanner sc = new Scanner (System.in);

        //Declaramos las variables actualYear, birthYear y age
        int actualYear, birthYear, age;

        /**
         * Le pedimos al usuario que introduzca el año actual y su año de nacimiento
         * y guardamos las respuestas en las variables correspondientes previamente
         * declaradas
         */
        System.out.println("Introduzca el año actual");
        actualYear=sc.nextInt();
        System.out.println("Introduzca su año de nacimiento");
        birthYear=sc.nextInt();

        /**
         * Calculamos la edad del usuario restandole al año actual (actualYear),
         * el año de nacimiento (birthYear)
         */
        age=actualYear-birthYear;

        //Mostramos la edad del usuario por consola
        System.out.println("Sabiendo esto, tienes "+age+" años");

    }
}
