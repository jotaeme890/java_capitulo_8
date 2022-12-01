/**
 * 4 potencia: Dada una base y un exponente devuelve la potencia.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime la potencia: ");
        int pot = sc.nextInt();

        System.out.println("El número " + num + " potenciado a " + pot + ", es: " + varias.potencia(num,pot));
        sc.close();
    }
}
