/**
 * FUNCIONES GENERALES DE MATEMÁTICAS
 * 
 * @author jotaeme
 */

package matematicas.general;

public class varias{

    /**
    * Dice si un número es capicúo o no
    *
    * @param x un número entero
    * @return booleano de si es capicúo o no
    */
    public static boolean esCapicuo(long x) {
        boolean salida ;
        if(volteado(x) == x){
            salida =  true;
        } else{
            salida =  false;
        }
        return salida;
    }

    public static boolean esCapicuo(int x) {
        return esCapicuo((long)x);
    }


    /**
    * Comprueba si un número entero positivo es primo o no.
    * Un número es primo cuando únicamente es divisible entre
    * él mismo y la unidad.
    *
    * @param x un número entero positivo
    * @return <code>true</code> si el número es primo
    * @return <code>false</code> en caso contrario
    */
    public static boolean esPrimo (long x){
        if(x<0){
            x = -x;
        }
        if(x<2){
            return false;
        }
        for(int i = 2; i<x/2 ;i++){
            if((x%i)==0){
                return false;
            }
        }
        return true;
    }

    public static boolean esPrimo(int x) {
        return esPrimo((long)x);
    }


    /**
    * Devuelve el siguiente primo al número que se pasa como parámetro.
    *
    * @param x un número entero
    * @return el primer primo que es mayor al número que se pasa como parámetro
    */
    public static long siguientePrimo(long x) {
        do {
            x++;
        } while (!esPrimo(x));
        return x;
    }    

    public static long siguientePrimo(int x) {
        return siguientePrimo((long)x);
    }

    /**
    * Calcula la potencia de un número
    *
    * @param x un número entero
    * @param r la potencia
    * @return número potenciado al número deseado
    */
    public static double potencia(double x,int r) {
        if(r==0){
            return 1;
        }
        if(r<0){
            return 1/potencia(x, -r);
        }
        double exponente=1;
        while (r-->0) {
            exponente*=x;
        }
        return exponente;
    }

    /**
    * Devuelve el número de dígitos que contiene un número entero
    *
    * @param num un número entero
    * @return la cantidad de dígitos que contiene el número
    */
    public static int digitos(long num) {
        if(num<0){
            num = -num;
        }
        if(num==0){
            return 1;
        }
        int digitos = 0;
        while (num > 0) {
            num /=10;
            digitos++;
        }
        return digitos;
    }

    public static int digitos(int x) {
        return digitos((long)x);
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

    public static long volteado(int x) {
        return volteado((long)x);
    }


    /**
    * Devuelve el número que está en una posición de un número entero
    *
    * @param x un número entero
    * @param pos la posición
    * @return el número que está en esa posición
    */
    public static int digitoN(long x,int pos) {
        if(pos<0 || pos>=digitos(x)){
            return -1;
        }
        return (int)(quitaporDetras(volteado(x), pos))%10; //Le damos la vuelta al número y le quitamos los números anteriores a la posición para después cogerlo y ese sería el dígito de la posición 
    }

    public static int digitoN(int x,int n) {
        return digitoN((long)x, n);
    }


    /**
    * Da la posición de la primera ocurrencia de un dígitodentro de un número entero, de izquierda a derecha.
    *
    * @param num un número entero
    * @param r un número a buscar en el número pedido anteriormente
    * @return la primera ocurrencia del número, si no -1
    */
    public static int posicionDeDigito(long x,int d) {
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

    public static int posicionDeDigito(int x,int n) {
        return posicionDeDigito((long)x, n);
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

    public static long quitaporDetras(int x, int d) {
        return  quitaporDetras((long)x, d);
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
