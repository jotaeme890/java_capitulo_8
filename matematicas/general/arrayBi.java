package matematicas.general;

public class arrayBi {

        /**
     * 
     * @param array array que se quiere imprimir de int
     */
    public static void escribeArrayBi(int [][] array){
        int digitosMax = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                int digitos = varias.digitos(array [i][j]);
                if(digitos > digitosMax){
                    digitosMax  = digitos ;
                }
            }
        }
        String format = "%"+digitosMax+"d ";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf(format, array[i][j]);
            }
            System.out.println();
        }
    }


    
    /**
    * Genera un array de tamaño n x m con números
    * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro
    *
    * @param filas filas del tamaño del array
    * @param columnas columnas del tamaño del array
    * @param minimo minimo del aleatorio
    * @param maximo maximo del aleatorio
    * @return array bidimensional
    */
    public static int[][] generaArrayBiInt(int filas, int columnas,int minimo, int maximo){
        int [][] x = new int [filas][columnas];
        for(int i = 0 ; i < filas ; i++){
            for(int j = 0 ; j < columnas ; j++){
                x[i][j] = (int)(Math.random()*(maximo-minimo+1)+minimo);
            }
        }
        return x;
    }


    /**
    * Devuelve la fila i-ésima del array que se pasa como parámetro.
    *
    * @param num un array
    * @param posicion la fila que quiere ver
    * @return array bidimensional
    */
    public static int[]  filaDeArrayBiInt(int [][] num,int posicion){
        if(num == null || num.length==0 || posicion < 0 || posicion >= num.length){
            return null;
        }
        return num[posicion].clone();
    }


    /**
    *  Devuelve la columna j-ésima del array que se pasa como parámetro.
    *
    * @param num un array
    * @param posicion la fila que quiere ver
    * @return array bidimensional
    */
    public static int[]  columnaDeArrayBiInt(int [][] num,int posicion){
        if(posicion < 0 || num.length==0 || num==null || posicion >= num[0].length){
            return null;
        }
        int[] f = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            f[i] = num[i][posicion];
        }
        return f;
    }


    /**
    *  : Devuelve la fila y la columna (en un array
    * con dos elementos) de la primera ocurrencia de un número dentro de un
    * array bidimensional. Si el número no se encuentra en el array, la función
    * devuelve el array {-1, -1}.
    *
    * @param num un array
    * @param numero el número que quiere buscar
    * @return posición en la que se encuentra el número
    */
    public static int[] coordenadasEnArrayBiInt(int  num [][],int numero){
        for(int i = 0 ; i < num.length ; i++){
            for(int j = 0 ; j < num[0].length ; j++){
                if(num[i][j]==numero){
                    int [] posicion = {i,j};
                    return posicion;
                }
            }
        }
        int [] posicion = {-1,-1};
        return posicion;
    }


    /**
    *  Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
    *
    * @param num un array
    * @param num el array
    * @param numero la fila
    * @param numero2 la columna
    * @return array bidimensional
    */
    public static boolean esPuntoDeSilla(int  num [][],int numero, int numero2){
        if(num==null|| num[0].length>0 ||numero < 0 ||numero >= num.length || numero2 <0 || numero2>=num[0].length){
            return false;
        }
        int[] fila = filaDeArrayBiInt(num, numero);
        int[] column = columnaDeArrayBiInt(num, numero2);
        return arrays.minimoArrayInt(fila) == num[numero][numero2] && arrays.maximoArrayInt(column) == num[numero][numero2];
    }


    /**
    *  Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
    *
    * @param num un array
    * @param num el array
    * @param numero la fila
    * @param numero2 la columna
    * @return array bidimensional
    */
    public static void numeroAle(int  num){
        System.out.print(Math.random()*17+1);
    }


    /**
    * Devuelve un array que contiene una de las diagonales del array
    * bidimensional que se pasa como parámetro.
    *
    * @param x array bidimiensional de números enteros
    * @param fila fila del número que marcará las dos posibles
    * diagonales dentro del array <code>x</code>
    * @param columna columna del número que marcará las dos posibles
    * diagonales dentro del array <code>x</code>
    * @param direccion cadena de caracteres que indica cuál de las dos
    * posibles diagonales se devolverá; la cadena <code>
    * "nose"</code> indica que se elige la diagonal que
    * va del noroeste hacia el sureste, mientras que la
    * cadena <code>"neso"</code> indica que se elige la
    * diagonal que va del noreste hacia el suroeste
    * @return array unidimensional que contiene una diagonal
    * definida por un número determinado por <code>fila
    * </code> y <code>columna</code> y una dirección
    * determinada por el parámetro <code>direccion
    * </code>
    */
    public static int[] diagonal(int[][] a, int fil, int col, String ori){
        int[] aux = new int[1000];
        int elementos = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if((i==fil && j==col) ||
                (ori.equals("nose") && (i < fil && j < col || i > fil && j > col) && Math.abs(fil-i) == Math.abs(col-j)) ||
                (ori.equals("neso") && (i < fil && j > col || i > fil && j < col) && Math.abs(fil-i) == Math.abs(col-j))){
                    aux[elementos] = a[i][j];
                    elementos++;
                }
            }
        }
        int[] res = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            res[i] = aux[i];
        }
        return res;
    }
}

