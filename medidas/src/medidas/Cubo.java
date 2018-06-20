/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidas;

import java.util.Scanner;

/**
 *
 * @author Toro
 */
public class Cubo extends Cuadrado{
    
    public void cubo(){
    System.out.println("Seleccione lo que quiere calcular :"
                + "para volumen presione 1 para perimetro presione 2 o salir 3");
     Scanner datos = new Scanner(System.in);
   
     int seleccion=datos.nextInt();
     switch(seleccion){
         case 1:System.out.println("Calcular volumen");
                    volumen();
             break;
         case 2:System.out.println("Calcular perimetro");
                    perim();
                    cubo();
             break;
         case 3:System.out.println("Regresando");
                System.exit(0);
            break;
     }
    
    }
     public void volumen(){
        
        Scanner datos = new Scanner(System.in);
        System.out.println("longitud");
        int longi= datos.nextInt();
        System.out.println("alto ");
        int alto= datos.nextInt();
        System.out.println("ancho ");
        int ancho= datos.nextInt();
        int volumen = alto*ancho*longi;
        System.out.println("El area es "+ volumen);
        cubo();
    }
}
