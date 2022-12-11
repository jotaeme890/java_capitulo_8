/**
 * 32 coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime el mínimo del intervalo: ");
        int min = sc.nextInt();
        System.out.print("Dime el máximo del intervalo: ");
        int max = sc.nextInt();


        int[][] num = arrayBi.generaArrayBiInt(5, 5,min, max);

        arrayBi.escribeArrayBi(num);

        System.out.print("Dime el número del que quieres ver su posición: ");
        int numero = sc.nextInt();

        arrayBi.coordenadasEnArrayBiInt(num, numero);

        sc.close();
    }
}
