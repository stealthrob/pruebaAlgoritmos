/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisalgoritmosbusqueda;


/**
 *
 * @author RNS
 */
public class AnalisisAlgoritmosBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     pruebaAlgoritm p;
     p = new pruebaAlgoritm();
     long startTime = System.nanoTime();


    
     /*
        long endTime = System.nanoTime();
         p.displayArrays();
        long duration = (endTime - startTime);
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println("Duración del método de crear arrays: "+duration+" nano segundos");
        */
        
        
        System.out.println("Sistema para probar algoritmos de ordenamiento.");
        
        System.out.println("");
        System.out.println("");
        System.out.println("Algoritmo Bubble.");
        p.pruebaBubble();
        System.out.println("");
        System.out.println("");
        System.out.println("Algoritmo Selection");
        p.pruebaSelection();
        
        System.out.println("");
        System.out.println("");
        System.out.println("Algoritmo Inserción");
        p.pruebaInsertion();
        
       
    }
    
}
