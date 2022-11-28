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

        String binario2 = Integer.toBinaryString(binario);
        int decimalCon = Integer.parseInt(binario2,2);
        
        System.out.print("El número " + binario + " en decimal es: " + decimalCon);

        sc.close();
    }
}
