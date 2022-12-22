/**
 * FUNCIONES GENERALES DE ARRAYS
 * 
 * @author jotaeme
 */


package matematicas.general;

public class arrays {

    /**
     * 
     * @param array array que se quiere imprimir de int
     */
    public static void escribeArray(int [] array){
        for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
        System.out.println();
    }

    
    /**
     * 
     * @param array array que se quiere imprimir de int
     */
    public static void escribeArray(String [] array){
        for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
        System.out.println();
    }


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
    public static double mediaArrayInt(int[] num){
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
    * Dice la posición en la que está un número dentro de un array
    *
    * @param num array de número enteros
    * @param n número a buscar en el array
    * @return posición del número y si no está devuelve -1
    */
    public static int posicionEnArray(int[] num, int n){
        for(int i = 0; i<num.length;i++){ 
            if(num[i] == n){
                return i; 
            }
        }
        return -1;
    }


    /**
    * Voltea un array
    *
    * @param num array de número enteros
    * @return dicho array volteado
    */
    public static int[] volteaArrayInt(int[] num){
        int [] a = new int [num.length]; //Creamos un array auxiliar para meterle los datos modificados
        for(int i = 0; i<num.length;i++){ 
            a[num.length-i-1] = num[i]; //A la última posición del array auxiliar le metemos el primer valor del array introducido
        }
        return a; //Devolvemos el array auxiliar con la modificación
    }


    /**
    * Rotamos a la derecha un array
    *
    * @param num array de número enteros
    * @param x posicion a la derecha
    * @return dicho array rotado hacia la derecha 
    */
    public static int[] rotaDerechaArrayInt(int[] num , int x){
        int aux=0; //Para guardar la última posición
        int [] a = num.clone(); //Clonamos lo que hay en el array 
        while (x-->0) {  //Mientras que la posición sea mayor que 0, es decir va a ir rotando todas las veces que sea
            aux = a[a.length-1]; //Guardamos en la variable auxiliar el último valor, esto en cada iteración
            for(int i =a.length-1 ;i>0;i--){ //Vamos de derecha a izquierda en el array
                a[i] = a[i - 1]; //Rotamos a la derecha
            }
            a[0]=aux; //Ponemos en el primer valor del array el valor de auxiliar, así rotandolo hacia la derecha
        }
        return a;
    }


    /**
    * Rotamos a la izquierda un array
    *
    * @param num array de número enteros
    * @param x posicion a la derecha
    * @return dicho array rotado hacia la izquierda
    */
    public static int[]  rotaIzquierdaArrayInt(int[] num , int x){
        int aux=0; //Para guardar la última posición
        int [] a = num.clone(); //Clonamos lo que hay en el array 
        while (x-->0) {  //Mientras que la posición sea mayor que 0, es decir va a ir rotando todas las veces que sea
            aux = a[0]; //Guardamos en la variable auxiliar el primer valor, esto en cada iteración
            for(int i =0;i<a.length-1;i++){ //Vamos de la izquierda a la derecha en el array
                a[i] = a[i + 1]; //Rotamos a la izquierda
            }
            a[a.length-1] =aux;//Ponemos en el último valor el primero del array, así rotandolo hacia la izquierda
        }
        return a;
    }

    /**
     * Devuelve un array con todos los
     * números primos que se encuentren
     * en otro array que se pasa como
     * parámetro.
     * Obviamente el tamaño del array
     * que se devuelve será menor o
     * igual al que se pasa como
     * parámetro.
     *
     *  @param x el array del que se quiere saber los primos
     * @return array con primos
     */
    public static int[] filtraPrimos(int x[]){
        int[] primos = new int[x.length];
        int cuentaPrimos = 0;
        for (int numero : x) {
            if (varias.esPrimo(numero)) {
                primos[cuentaPrimos++] = numero;
            }
        }
        int[] array = new int[cuentaPrimos];
        for (int i = 0; i < cuentaPrimos; i++) {
            array[i] = primos[i];
        }
        return array;
    }


    /**
     * Devuelve un array con todos los números
     * capicúa que se encuentren en otro array
     * que se pasa como parámetro.
     * Obviamente el tamaño del array que se
     * devuelve será menor o igual al que se
     * pasa como parámetro.
     *
     *  @param x el array del que se quiere saber los capicuos
     * @return array con capicuos
     */
    public static int[] filtraCapicuas(int x[]){
        int[] capicuo = new int[x.length];
        int capicuos = 0;
        for (int numero : x) {
            if (varias.esCapicuo(numero)) {
                capicuo[capicuos++] = numero;
            }
        }
        int[] array = new int[capicuos];
        for (int i = 0; i < capicuos; i++) {
            array[i] = capicuo[i];
        }
        return array;
    }


    /**
     * Devuelve un array con todos los números
     * que contienen el 7 (por ej. 7, 27, 782)
     * que se encuentren en otro array que se
     * pasa como parámetro. El tamaño del array
     * que se devuelve será menor o igual al
     * que se pasa como parámetro
     * 
     *  @param x el array para saber sus números 
     * @return array con números con 7
     */
    public static int[] filtraCon7(int x[]){
        int[] consiete = new int[x.length];
        int numeros = 0;
        for (int i = 0; i < x.length; i++) {
            if(varias.posicionDeDigito(x[i], 7) != -1){ //Ya que si no está dentro, devuelve -1
                consiete[numeros++] = x[i];
            }
        }
        int [] array = new int [numeros];
        for (int i = 0; i < numeros; i++) {
            array[i] = consiete[i];
        }
        return array;
    }
}

