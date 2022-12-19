/**
 * 37 Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
 * Morse. Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
 * desde el programa principal.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

import matematicas.general.varias;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        System.out.print("El número en morse sería: " + varias.convierteEnMorse(numero));
        sc.close();
    }
}
