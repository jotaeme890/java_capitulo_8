/**
 * 2 esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();

        if(matematicas.general.varias.esPrimo(num)){
            System.out.println(num + " es primo");
        } else{
            System.out.println(num + " no es primo");
        }
        sc.close();
    }
}
