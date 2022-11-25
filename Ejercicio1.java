/**
 * 1 esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();

        if(matematicas.general.varias.esCapicuo(num)){
            System.out.println("Es capicúo");
        } else{
            System.out.println("No es capicúo");
        }
        sc.close();
    }
}
