/**
 * 13 trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime la posición inicial: ");
        int num2 = sc.nextInt();
        System.out.print("Dime la posición final: ");
        int num3 = sc.nextInt();

        System.out.println("El número " + num + " con el añadido sería: " + matematicas.general.varias.trozoDeNumero(num, num2, num3));
        sc.close();
    }
}
