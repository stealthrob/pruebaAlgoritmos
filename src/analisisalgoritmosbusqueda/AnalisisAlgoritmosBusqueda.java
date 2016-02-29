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
    
        //0 es para los valores arrojados por el array ordenado
        //1 es para los valores arrojados por el array desordenado
        //2 es para los valores arrojados por el array al reves
        
        int rapido=0;
        int lento=0;
        int in =0;
        int[][] valores = new int [3][3];  
        String[] raps  = new String[3];
        raps[0] = "Bubble";
        raps[1] = "Selection";
        raps[2] = "Insertion";
        System.out.println("Sistema para probar algoritmos de ordenamiento.");
        
        System.out.println("");
        System.out.println("");
        System.out.println("Algoritmo Bubble.");
        pruebaAlgoritm p;
        p = new pruebaAlgoritm();
        p.pruebaBubble();
        System.out.println("");
        System.out.println("");
        System.out.println("Algoritmo Selection");
        pruebaAlgoritm p1;
        p1 = new pruebaAlgoritm();
        p1.pruebaSelection();
        System.out.println("");
        System.out.println("");
        System.out.println("Algoritmo Inserción");
        pruebaAlgoritm p2;
        p2 = new pruebaAlgoritm();
        p2.pruebaInsertion();
        
        System.out.println(" ");
        System.out.println("Comparación de tiempos de ejecución: ");
        System.out.println("Tiempo de ejecución diferentes algoritmos con array ORDENADO: ");
        System.out.println("Bubble: "+p.val[0][3]);
        System.out.println("Selection: "+p1.val[0][3]);
        System.out.println("Insertion: "+p2.val[0][3]);
        rapido = p.val[0][3];
        in = 0;
        if(p1.val[0][3]<p.val[0][3]&&p1.val[0][3]<p2.val[0][3]){
             rapido = p1.val[0][3];
            in = 1;
        }else if(p2.val[0][3]<p.val[0][3]&&p2.val[0][3]<p1.val[0][3]){
            rapido = p2.val[0][3];
            in =2;
        }
        System.out.println("Por lo tanto el algoritmo que ordena más rápido arreglos ORDENADOS es: "+raps[in]);
        System.out.println("Con un tiempo de: "+rapido);
        System.out.println(" ");
        System.out.println("Tiempo de ejecución diferentes algoritmos con array DESORDENADO: ");
        System.out.println("Bubble: "+p.val[1][3]);
        System.out.println("Selection: "+p1.val[1][3]);
        System.out.println("Insertion: "+p2.val[1][3]);
        rapido = p.val[1][3];
        in =0;
        if(p1.val[1][3]<p.val[1][3]&&p1.val[1][3]<p2.val[1][3]){
             rapido = p1.val[1][3];
            in = 1;
        }else if(p2.val[1][3]<p.val[1][3]&&p2.val[1][3]<p1.val[1][3]){
            rapido = p2.val[1][3];
            in =2;
        }
        System.out.println("Por lo tanto el algoritmo que ordena más rápido arreglos DESORDENADOS es: "+raps[in]);
        System.out.println("Con un tiempo de: "+rapido);
        System.out.println(" ");
        System.out.println("Tiempo de ejecución diferentes algoritmos con array DESORDENADO: ");
        System.out.println("Bubble: "+p.val[2][3]);
        System.out.println("Selection: "+p1.val[2][3]);
        System.out.println("Insertion: "+p2.val[2][3]);
        rapido = p.val[1][3];
        in =0;
        if(p1.val[2][3]<p.val[2][3]&&p1.val[2][3]<p2.val[2][3]){
             rapido = p1.val[2][3];
            in = 1;
        }else if(p2.val[1][3]<p.val[2][3]&&p2.val[2][3]<p1.val[2][3]){
            rapido = p2.val[2][3];
            in =2;
        }
        System.out.println("Por lo tanto el algoritmo que ordena más rápido arreglos AL REVES es: "+raps[in]);
        System.out.println("Con un tiempo de: "+rapido);
        
        
        
       
    }
    
}
