/**
 * 41 Realiza un programa que pinte un triángulo relleno tal como se muestra en
 * los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
 * ya se realizó en el tema de bucles, ahora se trata de usar una función para
 * que la implementación sea más sencilla. Por ejemplo, se puede crear una
 * función linea(char caracter, int repeticiones) que pinte una línea con el carácter
 * especificado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();
        for (int i = altura; i > 0; i--) {
            System.out.println(linea('*', i));
        }
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

