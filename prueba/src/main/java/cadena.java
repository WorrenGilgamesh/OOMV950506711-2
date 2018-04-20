/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdist
 */
public class cadena {
    
    public String subcadena(String cadena){
        String sub = null, uno="";
        for (int i = 0; i < cadena.length(); i++) {
            //System.out.println(cadena.substring(0,i));
            sub =cadena.substring(0,i);
            for (int j = 0; j < cadena.length(); j++) {
                uno=sub;
            }
            //System.out.println(uno);
        }
    return cadena;
}
    
    public static void main(String...argv) {
        cadena c = new cadena();
        String res;
        String cadena = "abab";
        res=c.subcadena(cadena);
        System.out.println(res);
    }
}
