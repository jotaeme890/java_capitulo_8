/**
 * 34 diagonal: Devuelve un array que contiene una de las diagonales del array
 * bidimensional que se pasa como parámetro. Se pasan como parámetros
 * fila, columna y dirección. La fila y la columna determinan el número que
 * marcará las dos posibles diagonales dentro del array. La dirección es
 * una cadena de caracteres que puede ser “nose” o “neso”. La cadena
 * “nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
 * mientras que la cadena “neso” indica que se elige la diagonal que va del
 * noreste hacia el suroeste.
 * 
 *  
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime el mínimo del intervalo: ");
        int min = sc.nextInt();
        System.out.print("Dime el máximo del intervalo: ");
        int max = sc.nextInt();

        int[][] num = arrayBi.generaArrayBiInt(5, 5,min, max);

        arrays.escribeArray(arrayBi.diagonal(num, 2, 2, "neso"));
        arrays.escribeArray(arrayBi.diagonal(num, 2, 2, "nose"));
        sc.close();
    }
}
