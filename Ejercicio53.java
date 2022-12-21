/** 
 * 53 Implementa una función con nombre nEsimo que busque el número que hay
 * dentro de un array bidimensional en la posición n-ésima contando de izquierda
 * a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
 * es el 0. Si la posición donde se busca no existe en el array, la función debe
 * devolver -1. Se debe entregar tanto el código de la función como el código de
 * prueba que la usa. La cabecera de la función es la siguiente:
 * 
 * @author jotaeme
*/

import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la longitud del array: ");
        int longitud1 = sc.nextInt();
        int array[] [] = new int [longitud1] [longitud1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
            System.out.print("Dime un número para el array: ");
            array[i][j] = sc.nextInt();
            }
        }
        System.out.print("Dime la posición: ");
        int pos = sc.nextInt();

        System.out.print("Dicha posición sería el número: " +  nEsimo(array, pos));
        sc.close();
    }

    public static int nEsimo(int[][] n, int posicion) {
        int filas = n.length;
        int columnas = n[0].length;
        if ((posicion < 0) || (posicion > filas * columnas - 1)) {
            return -1;
        } else {
            return n[posicion / columnas][posicion % columnas];
        }
    }
}
