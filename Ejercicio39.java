/**
 * 39 Esta función convierte los dígitos del número n en las correspondientes 
 * palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213
 * convertido a palabras sería:
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.varias;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        System.out.print("El número en palabras sería: " + varias.convierteEnPalabras(numero));
        sc.close();
    }
}
