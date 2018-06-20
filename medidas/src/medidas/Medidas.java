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
public class Medidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here+
        
        Cuadrado cuadrado= new Cuadrado();
        Cubo cubo = new Cubo();
        System.out.println("Seleccione Cuadrado=1 , Cubo=2 , Salir del sistema=3");
        Scanner datos = new Scanner(System.in);
   
     int seleccion=datos.nextInt();
     switch(seleccion){
         case 1:cuadrado.seleccion();
                    
             break;
         case 2:cubo.cubo();
             break;
         case 3:System.exit(0);
            break;
     }
        
        
        
        
        
    }
    
    
}
