/**
 * 11 pegaPorDetras: Añade un dígito a un número por detrás.
 * 
 * @author jotaeme
 */

import matematicas.general.*;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime el número a añadir: ");
        int num2 = sc.nextInt();

        System.out.println("El número " + num + " con el añadido sería: " + varias.pegaPorDetras(num, num2));
        sc.close();
    }
}
