/**
 * 6 voltea: Le da la vuelta a un número.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        
        System.out.println("El número volteado es: "+ matematicas.general.varias.volteado(num));
        sc.close();
    }
}
