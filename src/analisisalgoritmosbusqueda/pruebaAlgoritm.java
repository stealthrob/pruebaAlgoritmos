/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisalgoritmosbusqueda;

import java.util.Scanner;

/**
 *
 * @author RNS
 */
public class pruebaAlgoritm {

    private int[] arrayO, arrayD, arrayR;
    private int nElems;

    public pruebaAlgoritm() {
        //Creación de array ordenado

        arrayO = new int[1000];
        arrayD = new int[1000];
        arrayR = new int[1000];

        for (int i = 0; i < 1000; i++) {
            arrayO[i] = i + 1;
        }
        //Creación de array revés
        for (int i = 999; i > -1; i--) {
            arrayR[1000 - (i + 1)] = i + 1;
        }
        //Creación de array desordenado

        for (int i = 0; i < 1000; i++) {

            arrayD[i] = (int) (Math.random() * 1000);

        }
        this.nElems = 1000;

    }

    public void displayArrays() {
        int cont = 0;
        System.out.println("Array Ordenado");
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                System.out.print(arrayO[cont] + " ");
                cont++;
            }
            System.out.println("");
        }
        System.out.println("Array Desordenado");
        cont = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                System.out.print(arrayD[cont] + " ");
                cont++;
            }
            System.out.println("");
        }
        System.out.println("Array al revés");
        cont = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                System.out.print(arrayR[cont] + " ");
                cont++;
            }
            System.out.println("");
        }
    }
    
    public int[]  bubbleSort(int array[]){
        int out,in,itera=0,compara=0;
        int[] val;
        for (out=nElems-1; out > 1; out--) {
            itera++;
            for (in = 0; in < out; in++) {
                compara++;
                if(array[in]>array[in+1]){
                    swap(in,in+1,array);
                }
            }
        }
        System.out.println("No. de iteraciones: "+itera);
        System.out.println("No. de comparaciones: "+compara);
        val = new int[2];
        val[0] = itera;
        val[1] = compara;
        return val;
    }
    
    public void selectionSort(int array[]){
        int out, in, min,itera=0,compara=0;
        
        for (out = 0; out < nElems; out++) {
            min = out;
            itera++;
            for (in = out+1; in < nElems; in++) {
                compara++;
                if(array[in]<array[min])
                    min=in;
                swap(out,min,array);
            }
            
        }
        
        System.out.println("No. de iteraciones: "+itera);
        System.out.println("No. de comparaciones: "+compara);
    }
    
    public void insertionSort(int array[]){
        int in,out;
        for (out = 1; out < nElems; out++) {
            long temp = array[out];
            in = out;
            while(in>0 && array[in-1]>=temp){
                array[in] = array[in-1];
                --in;
            }
            array[in] = (int)temp;
        }
    }
    
    public void pruebaBubble(){
        //Ordenado
        System.out.println("Algoritmo burbuja, array ordenado:");
        long startTime = System.nanoTime();
        
        bubbleSort(arrayO);
        long endTime = System.nanoTime();
        long durationO = (endTime - startTime);
        System.out.println("Duración de la prueba: "+durationO);
        //Desordenado
        System.out.println("Algoritmo burbuja, array desordenado:");
        startTime = System.nanoTime();
        
        bubbleSort(arrayD);
        endTime = System.nanoTime();
        long durationD = (endTime - startTime);
        System.out.println("Duración de la prueba: "+durationD);
        //Reves
        System.out.println("Algoritmo burbuja, array al reves:");
        startTime = System.nanoTime();
        bubbleSort(arrayR);
        endTime = System.nanoTime();
        long durationR = (endTime - startTime);
        System.out.println("Duración de la prueba: "+durationR);
        
        
    }
    
    
    public void pruebaSelection(){
        //Ordenado
        
        System.out.println("Algoritmo de selección, array ORDENADO");
        long startTime = System.nanoTime();
        selectionSort(arrayO);
        long endTime = System.nanoTime();
        long durationO = (endTime - startTime);
        System.out.println("Duración de la prueba: "+durationO);
        //Desordenado
        System.out.println("Algoritmo de selección, array DESORDENADO");
        startTime = System.nanoTime();
        selectionSort(arrayD);
        endTime = System.nanoTime();
        long durationD = (endTime - startTime);
        System.out.println("Duración de la prueba: "+durationD);
        //Reves
        System.out.println("Algoritmo de selección, array AL REVÉS");
        startTime = System.nanoTime();
        selectionSort(arrayR);
        endTime = System.nanoTime();
        long durationR = (endTime - startTime);
        System.out.println("Duración de la prueba: "+durationR);
    }
    
    public void pruebaInsertion(){
         //Ordenado
        long startTime = System.nanoTime();
        selectionSort(arrayO);
        long endTime = System.nanoTime();
        long durationO = (endTime - startTime);
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println("Duración de la prueba: "+durationO);
        //Desordenado
        startTime = System.nanoTime();
        insertionSort(arrayD);
        endTime = System.nanoTime();
        long durationD = (endTime - startTime);
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println("Duración de la prueba: "+durationD);
        //Reves
        startTime = System.nanoTime();
        insertionSort(arrayR);
        endTime = System.nanoTime();
        long durationR = (endTime - startTime);
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println("Duración de la prueba: "+durationR);
    }
    
     private void swap(int one, int two,int array[]){
                int temp = arrayO[one];
                array[one] = array[two];
                array[two] = temp;
                
            }

}
