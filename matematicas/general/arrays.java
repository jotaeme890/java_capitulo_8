/**
 * FUNCIONES GENERALES DE ARRAYS
 * 
 * @author jotaeme
 */


package matematicas.general;

public class arrays {

    /**
    * Genera un array de tamaño n con números aleatorios
    * cuyo intervalo (mínimo y máximo) se indica como parámetro.
    *
    * @param n tamaño del array
    * @param minimo minimo del aleatorio
    * @param maximo maximo del aleatorio
    * @return array 
    */
    public static int[] generaArrayInt(int n,int minimo, int maximo){
        int [] x = new int [n];
        for(int i = 0 ;i<n;i++){
            x[i] = (int)(Math.random()*(maximo-minimo+1)+minimo);
        }
        return x;
    }


    /**
    * Devuelve el mínimo del array que se pasa como parámetro.
    *
    * @param n array de número enteros
    * @return mínimo del array
    */
    public static int minimoArrayInt(int[] n){
        int minimo = Integer.MAX_VALUE;
        for(int i = 0; i<n.length;i++){ 
            if(n[i] < minimo){
                minimo = n[i];
            }
        }
        return minimo;
    }


    /**
    * Devuelve el máximo del array que se pasa como parámetro.
    *
    * @param n array de número enteros
    * @return máximo del array
    */
    public static int maximoArrayInt(int[] n){
        int maximo = Integer.MIN_VALUE;
        for(int i = 0; i<n.length;i++){ 
            if(n[i] > maximo){
                maximo = n[i];
            }
        }
        return maximo;
    }


    /**
    * Devuelve la media del array que se pasa como parámetro.
    *
    * @param num array de número enteros
    * @return media del array
    */
    public static double mediaArrayInt(double[] num){
        int suma = 0;
        for(int i = 0; i<num.length;i++){ 
            suma += num[i];
        }
        return suma/num.length;
    }


    /**
    * Dice si un número está o no dentro de un array.
    *
    * @param num array de número enteros
    * @param n número a buscar en el array
    * @return true si está y false si no está
    */
    public static boolean estaEnArrayInt(int[] num, int n){
        for(int i = 0; i<num.length;i++){ 
            if(num[i] == n){
                return true; 
            }
        }
        return false;
    }


    /**
    * Dice si un número está o no dentro de un array.
    *
    * @param num array de número enteros
    * @param n número a buscar en el array
    * @return máximo del array
    */
    public static int posicionEnArray(int[] num, int n){
        int numero = 0;
        for(int i = 0; i<num.length;i++){ 
            if(num[i] == n){
                numero = i; 
            }
        }
        return numero;
    }

}
