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
        int decimal= sc.nextInt();

        String binario2 = Integer.toBinaryString(decimal);
        
        System.out.print("El número " + decimal + " en binario es: " + binario2);

        sc.close();
    }
}
