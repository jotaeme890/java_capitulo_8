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
        for(int i = 2; i<x ;i++){
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
        } while (!esPrimo(x)); //Usamos la función de primo anteriormente creada para que nos sea más fácil
        return x;
    }        


    /**
    * Devuelve el número de dígitos que contiene un número entero
    *
    * @param num un número entero
    * @return la cantidad de dígitos que contiene el número
    */
    public static int digitos(long num) {
        int digitos = 0;
        while (num > 0) {
            num /=10;
            digitos++;
        }
        return digitos;
    }


    /**
    * Devuelve el número que está en una posición de un número entero
    *
    * @param x un número entero
    * @param n la posición
    * @return el número que está en esa posición
    */
    public static int digitoN(int x,int n) {
        x = (int) volteado(x); //Para contar de izq a der
        while (n -- >0) {
            x/=10;
        }
        return (x %10);
    }


    /**
    * Devuelve el número de dígitos que contiene un número entero
    *
    * @param num un número entero
    * @param r un número a buscar en el número pedido anteriormente
    * @return la primera ocurrencia del número, si no -1
    */
    public static int posicionDeDigito(int x,int d) {
        int pos = 0;
        x = (int) volteado(x); //Le damos la vuelta para contar y que no nos borre el número al achicarlo
        do {
            if (x % 10 == d){ //Si la última posición del número al revés es igual a la que queremos buscar devuelve ese valor
                return pos;
            }
            x /= 10; //Si no lo achicamos
            pos++; //Y aumentamos la variable que vamos a usar para dar la posición
        } while (x > 0); //Haremos esto mientras el número sea mayor a 0, en la última iteración el número se dividiría entre 10 (si no se ecuentra el número igual) y saldrá del bucle, devolviendo -1
        return -1;  //Si se acaba el número y no ha salido el número devolverá -1
    }


    /**
    * Voltea un número
    *
    * @param num un número entero
    * @return el número volteado
    */
    public static long volteado(long num) {
        long aux = num;
        long numeroReves = 0;
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


    /**
    * Calcula la potencia de un número
    *
    * @param x un número entero
    * @param r la potencia
    * @return número potenciado al número deseado
    */
    public static double potencia(int x, int r) {
        double potenciado = (Math.pow(x,r));
        return potenciado;
    }


    /**
    * Le quita a un número, n dígitos por detrás (por la derecha).
    *
    * @param x un número entero
    * @param d dífitos que se quitan
    * @return número sin el último número
    */
    public static long quitaporDetras(long x, int d) {
        return  x/(long)potencia(10,d);
    }
    

    /**
    * Le quita a un número, n dígitos por delante (por la izquierda).
    *
    * @param num un número entero
    * @param d dífitos que se quitan
    * @return la cantidad de dígitos que contiene el número
    */
    public static long quitaPorDelante(long num, int d) {
        num = volteado(num);
        num = quitaporDetras(num, d);
        num = volteado(num);
        return num;
    }


    /**
    * Añade un dígito a un número por detrás.
    *
    * @param num un número entero
    * @param x dígito que se añade
    * @return el número con el otro añadido por detrás
    */
    public static long pegaPorDetras(long num, int x) {
        long numero = (num*10)+x;
        return numero;
    }


    /**
    * Añade un dígito a un número por detrás.
    *
    * @param num un número entero
    * @param x dígito que se añade
    * @return el número con el otro añadido por delante
    */
    public static long pegaPorDelante(long x, int n) {
        x = volteado(x);
        x = (x * 10) + n;
        x = volteado(x);
        return x;
    }


    /**
    * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
    *
    * @param x un número entero
    * @param n la posición inicial
    * @param n1 posición final
    * @return el número modificado
    */
    public static long  trozoDeNumero(long x, int n,int n1) {
        int longitud = digitos(x);
        x = quitaPorDelante(x,n);
        x = quitaporDetras(x, longitud - n1 - 1);
        return x;
    }


    /**
    * Pega dos números para formar uno.
    *
    * @param num un número entero 1
    * @param x un número entero 2
    * @return el número con el otro añadido por delante
    */
    public static long  juntaNumeros(long num, long x) {
        long numero = (long)((long)num*potencia(10, digitos(x)));
        numero +=x;
        return numero;
    }

    
    /**
    * Pasa un decimal a binario
    *
    * @param num un número entero
    * @return el número en binario
    */
    public static String aBinario(int num) {
        String numero = Integer.toBinaryString(num);
        return numero;
    }


    /**
    * Pasa un binario a decimal
    *
    * @param num un número entero
    * @return el número en decimal
    */
    public static int aDecimal(String num) {
        int numero = Integer.parseUnsignedInt(num,2);
        return numero;
    }

}
