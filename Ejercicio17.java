/**
 * 17 Escribe un programa que pase de binario a decimal.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número binario: ");
        int binario= sc.nextInt();
        
        System.out.print("El número " + binario + " en decimal es: " + varias.aDecimal(binario));

        sc.close();
    }
}
