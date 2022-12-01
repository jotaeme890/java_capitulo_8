/**
 * 19 Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un número: ");

        String num = sc.next();
        String aux = num;
        

        System.out.println("Que quieres hacer con el número: ");
        System.out.print("1)A decimal \n2)A binario\n3)A hexadecimal\n4)A octal\n");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:

            break;

            case 2:

            break;

            case 3:


            case 4:
                
            break;
            default:
                break;
        }
        sc.close();
    }
}