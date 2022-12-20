/**
 * 52 Esta función debe devolver un número del array escogido al azar entre todos
 * los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
 * podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
 * prueba.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la longitud del array: ");
        int longitud1 = sc.nextInt();
        int array[] = new int [longitud1];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Dime un número para el array: ");
            array[i] = sc.nextInt();
        }

        System.out.print("El número aleatorio del array es: " + aleatorioDeArray(array));
        sc.close();
    }

    public static int aleatorioDeArray(int[] a){
        return a[(int)Math.random()*a.length];
    } 
}
