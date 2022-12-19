import java.util.Scanner;

import matematicas.general.varias;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        System.out.print("El número en palabras sería: " + varias.convierteEnPalabras(numero));
        sc.close();
    }
}
