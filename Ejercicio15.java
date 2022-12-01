/**
 * 15 Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author jotaeme
 */

import matematicas.general.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        for(int i = 1; i<1000 ;i++){
            if(varias.esPrimo(i)){
                System.out.println(i);
            }
        }
    }
}
