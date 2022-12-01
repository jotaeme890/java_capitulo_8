/**
 * 14 juntaNumeros: Pega dos números para formar uno.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime el número a añadir: ");
        int num2 = sc.nextInt();

        System.out.println("El número con el añadido sería: " + varias.juntaNumeros(num, num2));
        sc.close();
    }
}
