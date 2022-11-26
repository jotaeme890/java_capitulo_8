/**
 * 9 quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        
        System.out.println("El número sin el número de detrás: " + matematicas.general.varias.quitaporDetras(num));
        sc.close();
    }
}
