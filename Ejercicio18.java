/**
 * 17 Escribe un programa que pase de decimalo a binario.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número decimal: ");
        int numero = sc.nextInt();
        
        System.out.print("El número " + numero + " en binario es: " + matematicas.general.varias.aBinario(numero));
        sc.close();
    }
}
