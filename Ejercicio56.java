/**
 * 56 Implementa una función con nombre corteza que sea capaz de extraer la capa
 * exterior de un array bidimensional. Esta capa se extrae en forma de array de
 * una dimensión. La extracción de números comienza en la esquina superior
 * izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
 * tanto el código de la función como el código de prueba que la usa. La cabecera
 * de la función es la siguiente:
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio56 {
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
        for (int numero : corteza(array)) {
            System.out.print(numero + " ");
        }

        sc.close();
    }

    
    public static int[] corteza(int[][] n) {
        int filas = n.length;
        int columnas = n[0].length;
        int[] array = new int[2 * filas + 2 * columnas - 4]; //Le restamos 4 ya que si no se saldría del array por 4, al igual que al restar -1, pero al ser 4, se le restan 4
        int cantidad = 0;

        for (int i = 0; i < columnas - 1; i++) { //arriba
            array[cantidad++] = n[0][i];
        }

        for (int i = 0; i < filas - 1; i++) { //der
            array[cantidad++] = n[i][columnas - 1];
        }

        for (int i = columnas - 1; i > 0; i--) { //abajo
            array[cantidad++] = n[filas - 1][i];
        }

        for (int i = filas - 1; i > 0; i--) { //izq
            array[cantidad++] = n[i][0];
        }
        return array;
    }
}
