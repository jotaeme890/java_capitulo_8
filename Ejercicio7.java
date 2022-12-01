/**
 * 7 digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime la posición del número que quieres ver: ");
        int pos = sc.nextInt();
        
        System.out.println("El número que está en esa posición es: "+ matematicas.general.varias.digitoN(num,pos));
        sc.close();
    }
}
