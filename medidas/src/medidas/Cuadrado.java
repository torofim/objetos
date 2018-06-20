/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 *
 * @author Toro
 */
public class Cuadrado {
   
  
   
     public void seleccion(){
     System.out.println("Seleccione lo que quiere calcular :"
                + "para area presione 1 para perimetro presione 2 o salir 3");
     Scanner datos = new Scanner(System.in);
   
     int seleccion=datos.nextInt();
     switch(seleccion){
         case 1:System.out.println("Calcular area");
                    area();
             break;
         case 2:System.out.println("Calcular perimetro");
                    perim();
             break;
         case 3:System.out.println("Regresando");
                System.exit(0);
            break;
     }
       
  
     
     }
    public void area(){
        
        Scanner datos = new Scanner(System.in);
        System.out.println("Alto");
        int alto= datos.nextInt();
        System.out.println("Base ");
        int base= datos.nextInt();
        int area = alto*base;
        System.out.println("El area es "+ area);
        seleccion();
    }
        
       
        
        public void perim(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Alto");
        int alto= datos.nextInt();
        System.out.println("Ancho ");
        int ancho= datos.nextInt();
        int perimetro = 2*(alto*ancho);
        System.out.println("El perimetro es "+ perimetro);
        seleccion();
        }
       
          
        
        
   
   
    
    
   
  
   
}
