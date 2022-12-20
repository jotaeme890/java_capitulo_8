/**
 * 45 Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
 * usuario debe introducir la altura de la figura. Podemos suponer que el usuario
 * introduce una altura mayor o igual a 3.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();
        for (int i = 1; i < altura; i++) {
            System.out.print(linea('*', i));
            System.out.print(linea(' ', altura * 2 - i * 2 - 1));
            System.out.println(linea('*', i));
        }
        System.out.println(linea('*', altura * 2 - 1));
        sc.close();
    }
    
    public static String linea(char caracter, int repeticiones) {
        String resultado = "";
        for (int i = 0; i < repeticiones; i++) {
            resultado += caracter;
        }
        return resultado;
    }
}
