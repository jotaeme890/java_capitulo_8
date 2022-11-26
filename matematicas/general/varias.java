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
    * Devuelve el número de dígitos que contiene un número entero
    *
    * @param num un número entero
    * @return el número que está en esa posición
    */
    public static int digitoN(int num,int r) {
        int digitos = 0;
        int digito = r;
        int aux = num;
        while (aux > 0) { //Dígitos del número
            aux /=10;
            digitos++;
        }
        if(digitos==r){ //Comprobamos cuando los dígitos sean ogual a la posición deseada
            digito = num%10;
        } else{
            num/=10;
        }
        return digito;
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

        x = volteado(x); //Le damos la vuelta para contar y que no nos borre el número al achicarlo

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
    * Le quita a un número n dígitos por detrás (por la derecha).
    *
    * @param x un número entero
    * @return número sin el último número
    */
    public static int quitaporDetras(int x) {
        int numero = x/10;
        return numero;
    }
    

    /**
    * quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
    *
    * @param num un número entero
    * @return la cantidad de dígitos que contiene el número
    */
    public static double quitaPorDelante(int num) {
        double numero = num % Math.pow(10,(digitos(num)-1));
        return numero;
    }


    /**
    * pegaPorDetras: Añade un dígito a un número por detrás.
    *
    * @param num un número entero
    * @return el número con el otro añadido por detrás
    */
    public static int pegaPorDetras(int num, int x) {
        int numero = (num*10)+x;
        return numero;
    }


    /**
    * pegaPorDetras: Añade un dígito a un número por detrás.
    *
    * @param num un número entero
    * @return el número con el otro añadido por delante
    */
    public static double pegaPorDelante(int num, int x) {
        double numero = (x*Math.pow(10,digitos(num))) + num;
        return numero;
    }
}
