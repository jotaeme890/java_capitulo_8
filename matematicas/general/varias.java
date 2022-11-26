/**
 * FUNCIONES GENERALES DE MATEMÁTICAS
 * 
 * @author jotaeme
 */

package matematicas.general;

public class varias{
    /**
    * Comprueba si un número entero positivo es primo o no.
    * Un número es primo cuando únicamente es divisible entre
    * él mismo y la unidad.
    *
    * @param x un número entero positivo
    * @return <code>true</code> si el número es primo
    * @return <code>false</code> en caso contrario
    */
    public static boolean esPrimo (int x){
        for(int i = 2; i<x/2 ;i++){
            if((x%i)==0){
                return false;
            }
        }
        return true;
    }


    /**
    * Devuelve el siguiente primo al número que se pasa como parámetro.
    *
    * @param x un número entero
    * @return el primer primo que es mayor al número que se pasa como parámetro
    */
    public static int siguientePrimo(int x) {
        do {
            x++;
        } while (!esPrimo(x));
        return x;
    }        


    /**
    * Devuelve el número de dígitos que contiene un número entero
    *
    * @param x un número entero
    * @return la cantidad de dígitos que contiene el número
    */
    public static int digitos(int x) {
        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
            x = x / 10;
            n++;
            }
            return n;
        }
    }


    /**
    * Voltea un número
    *
    * @param x un número entero
    * @return el número volteado
    */
    public static int volteado(int x) {
        int aux = x;
        int numeroReves = 0;
        while (aux>0) {
            numeroReves = (numeroReves*10)+(aux%10);
            aux/=10;
        }
        return numeroReves;
    }


    /**
    * Dice si un número es capicúo o no
    *
    * @param x un número entero
    * @return booleano de si es capicúo o no
    */
    public static boolean esCapicuo(int x) {
        if(volteado(x) == x){
            return true;
        } else{
            return false;
        }
    }


}
