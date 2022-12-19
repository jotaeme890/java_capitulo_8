/**
 * 35 Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
 * | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
 * para comprobar que funciona bien. Desde la función no se debe mostrar nada
 * por pantalla, solo se debe usar print desde el programa principal.
 * 
 * @author jotaeme
 */  

import matematicas.general.varias;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        System.out.print(varias.convierteEnPalotes(numero));
        sc.close();
    }
}
