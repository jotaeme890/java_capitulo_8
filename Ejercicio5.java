/**
 * 5 digitos: Devuelve el número de dígitos que contiene un número entero
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        
        System.out.println("Tiene "+ varias.digitos(num) + " dígitos");
        sc.close();
    }
}
