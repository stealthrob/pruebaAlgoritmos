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

    private long[] arrayO, arrayD, arrayR;
    private int nElems;
    public int[][] val;
    long startTime, endTime, duration;

    public pruebaAlgoritm() {
        //Creación de array ordenado

        arrayO = new long[1000];
        arrayD = new long[1000];
        arrayR = new long[1000];
        val = new int[3][4];
        //0 es para los valores arrojados por el array ordenado
        //1 es para los valores arrojados por el array desordenado
        //2 es para los valores arrojados por el array al reves

        for (int i = 0; i < 1000; i++) {
            arrayO[i] = i + 1;
        }
        //Creación de array revés
        for (int i = 0; i < 1000; i++) {
            arrayR[i] = 1000 - i;
        }
        //Creación de array desordenado

        for (int i = 0; i < 1000; i++) {

            arrayD[i] = (int) (Math.random() * 100000);

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

    public int[] bubbleSort(long array[]) {
        startTime = System.nanoTime();
        int out, in;
        int itera = 0, compara = 1, swaps = 0;
        int[] val;
        for (out = nElems - 1; out > 1; out--) {
            itera++;
            for (in = 0; in < out; in++) {
                compara++;
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1, array);
                    swaps++;
                }
            }
        }
        System.out.println("No. de iteraciones: " + itera);
        System.out.println("No. de comparaciones: " + compara);
        System.out.println("No. de swaps: " + swaps);
        val = new int[4];
        val[0] = itera;
        val[1] = compara;
        val[2] = swaps;

        endTime = System.nanoTime();
        duration = (endTime - startTime);
        val[3] = (int) duration;

        System.out.println("Duración de la prueba duration: " + val[3]);
        return val;
    }

    public int[] selectionSort(long array[]) {
        startTime = System.nanoTime();
        int out, in, min, itera = 0, compara = 0, swaps = 0;
        int[] val;

        for (out = 0; out < nElems; out++) {
            min = out;
            itera++;
            for (in = out + 1; in < nElems; in++) {
                compara++;
                if (array[in] < array[min]) {
                    min = in;
                    swaps++;
                }

                swap(out, min, array);
            }

        }
        System.out.println("No. de iteraciones: " + itera);
        System.out.println("No. de comparaciones: " + compara);
        System.out.println("No. de swaps: " + swaps);
        val = new int[4];
        val[0] = itera;
        val[1] = compara;
        val[2] = swaps;

        endTime = System.nanoTime();
        duration = (endTime - startTime);
        val[3] = (int) duration;
        System.out.println("Duración de la prueba: " + val[3]);
        return val;
    }

    public int[] insertionSort(long array[]) {
        long startTime = System.nanoTime();
        int in, out, itera = 1, compara = 0, swaps = 0;
        int[] val;

        for (out = 1; out < nElems; out++) {
            long temp = array[out];
            in = out;

            compara++;
            while (in > 0 && array[in - 1] >= temp) {

                swaps++;
                array[in] = array[in - 1];
                --in;
            }
            array[in] = (int) temp;
        }
        System.out.println("No. de iteraciones: " + itera);
        System.out.println("No. de comparaciones: " + compara);
        System.out.println("No. de swaps: " + swaps);
        val = new int[4];
        val[0] = itera;
        val[1] = compara;
        val[2] = swaps;

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        val[3] = (int) duration;
        System.out.println("Duración de la prueba: " + val[3]);
        return val;
    }

    public void pruebaBubble() {

        //Ordenado
        //----------------------------------------------------------------------
        System.out.println("Algoritmo burbuja, array ORDENADO:");

        this.val[0] = bubbleSort(arrayO);

        System.out.println(" ");

        //Desordenado
        //----------------------------------------------------------------------
        System.out.println("Algoritmo burbuja, array DESORDENADO:");

        this.val[1] = bubbleSort(arrayD);
        System.out.println(" ");

        //Reves
        //----------------------------------------------------------------------
        System.out.println("Algoritmo burbuja, array AL REVES:");
        this.val[2] = bubbleSort(arrayR);
        System.out.println(" ");

    }

    public void pruebaSelection() {

        //Ordenado
        //----------------------------------------------------------------------
        System.out.println("Algoritmo de selección, array ORDENADO");

        this.val[0] = selectionSort(arrayO);

        //Desordenado
        //----------------------------------------------------------------------
        System.out.println("Algoritmo de selección, array DESORDENADO");
        this.val[1] = selectionSort(arrayD);
        System.out.println(" ");
        //Reves
        //----------------------------------------------------------------------
        System.out.println("Algoritmo de selección, array AL REVÉS");
        this.val[2] = selectionSort(arrayR);
        System.out.println(" ");
    }

    public void pruebaInsertion() {

        //Ordenado
        //----------------------------------------------------------------------
        System.out.println("Algoritmo de inserción, array ORDENADO");

        this.val[0] = insertionSort(arrayO);
        System.out.println(" ");

        //Desordenado
        //----------------------------------------------------------------------
        System.out.println("Algoritmo de inserción, array DESORDENADO");

        this.val[1] = insertionSort(arrayD);
        System.out.println(" ");
        //Reves
        //----------------------------------------------------------------------
        System.out.println("Algoritmo de inserción, array AL REVES.");

        this.val[2] = insertionSort(arrayR);
        System.out.println(" ");

    }

    private void swap(int one, int two, long array[]) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;

    }

}
