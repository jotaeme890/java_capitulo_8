/**
 * 16 Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author jotaeme
 */

import matematicas.general.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        for(int i = 1; i<1000 ;i++){
            if(varias.esCapicuo(i)){
                System.out.println(i);
            }
        }
    }
}
