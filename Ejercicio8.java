/**
 * 8 osicionDeDigito: Da la posición de la primera ocurrencia de un dígitodentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime otro número: ");
        int pos = sc.nextInt();
        
        System.out.println("El número está en la posición: "+ matematicas.general.varias.posicionDeDigito(num,pos));
        sc.close();
    }
}
