package ejbasico;

import java.util.Scanner;

public class EjBasico3 {
    public static void main(String[] args) {

        //Creo el Scanner para leer por teclado
        Scanner sc = new Scanner (System.in);

        //Le pedimos al usuario que introduzca el año actual
        System.out.println("Introduzca el año actual");

        //Declaro la variable anyoActual donde se guarda el año introducido por consola y lo guardo
        int anyoActual=sc.nextInt();

        //Le pedimos al usuario su año de nacimiento
        System.out.println("Introduzca su año de nacimiento");

        //Declaro la variable anyoActual donde se guarda el año introducido por consola y lo guardo
        int anyoNacimiento=sc.nextInt();

        //Declaro la variable edad donde calculo la edad del usuario restandole a anyoActual anyoNacimiento
        int edad=anyoActual-anyoNacimiento;

        //Muestro edad por consola
        System.out.println("Sabiendo esto tu edad es: "+edad);

    }
}
