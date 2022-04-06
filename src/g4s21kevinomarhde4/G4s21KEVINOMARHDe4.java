/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21kevinomarhde4;

import java.util.ArrayList;

/**
 *
 * @author PERONAL
 */
public class G4s21KEVINOMARHDe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> Lista = new ArrayList<String>();
        Lista.add("Fernando");
        Lista.add("Monica");
        Lista.add("Araceli");
        Lista.add("Federico");
        Lista.add("armando");
        
        for (int i=0; i<Lista.size();i++){
            System.out.println("valor en posicion ["+i+"] =" + Lista.get(i));
        }
        int a=0;
        for (String cadena : Lista){
            System.out.println("valor de la lista en posicion[" + a + "] = " + cadena);
            a++;
        }
        a=0;
        Lista.forEach(cadena ->{
            System.out.println("valor de la lista " + cadena);
    });
        
        Lista.stream().forEach(cadena ->{
            System.out.println("valor de la lisra por medio de stream" + cadena);
        });
    }
    
}
