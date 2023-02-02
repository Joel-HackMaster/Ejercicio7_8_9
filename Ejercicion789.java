package com.javasesion1.InputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
public class Ejercicion789 {
    public static void main(String[] args) {
        String sentence = "Hola Mundo";
        String palabraReversa = reverse(sentence);
        System.out.println(palabraReversa);

        System.out.println("\n\n");
        char[] array1 = {'a','b','c','d','f','g','h','i','j'};
        for (char arr: array1){
            System.out.print(arr);
        }
        System.out.println("\n\n");
        int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Nos encontramos en la fila "+i+" y la columna "+j+": "+array2[i][j]);
            }
        }
        System.out.println("\n\n");
        Vector<Integer> vectorcito = new Vector<>();
        vectorcito.add(1);
        vectorcito.add(2);
        vectorcito.add(3);
        vectorcito.add(4);
        vectorcito.add(5);
        for(int number: vectorcito){
            System.out.println(number);
        }
        System.out.println("\n\n");
        vectorcito.remove(2);
        vectorcito.remove(3);

        for(int number: vectorcito){
            System.out.println(number);
        }

       // Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        //==> El principal problema de los vectores es el gasto de memoria pues cuando estos llegan asu maximo realizan una copia lo que duplica su capacidad por lo que a futuro podria ser un problema.

        /*
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

         */
        System.out.println("\n\n");
        ArrayList<String> animales = new ArrayList<>();
        animales.add("Gato");
        animales.add("Perro");
        animales.add("Leon");
        animales.add("Gorila");

        LinkedList<String> ListaAnimales = new LinkedList<>();

        for(int i=0; i<animales.size(); i++){
            ListaAnimales.add(animales.get(i));
        }

        for(String list: animales){
            System.out.println(list);
        }
        System.out.println("\n\n");
        for(String list: ListaAnimales){
            System.out.println(list);
        }
        ArrayList<Integer> numero = new ArrayList<>();

        for(int i=0; i<10; i++){
            numero.add(i+1);
        }

        try {
            //Si le pongo 10 me pide que coloque una excepcion pero si uso numero.size() corre con normalidad
            for (int i=0; i<numero.size(); i++){
                if(numero.get(i)%2 == 0){
                    numero.remove(i);
                }
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("\n\n");
        for(int num : numero){
            System.out.println(num);
        }

        System.out.println("\n\n");

        try {
            DividePorCero(4,0);
        }catch (Exception e){
            System.out.println("Salto la excepcion campeon! "+e.getMessage());
        }

    }

    public static double DividePorCero(int A, int B) throws ArithmeticException{
        int result=0;
        try {
            result = A / B;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return result;
    }
    public static String reverse(String texto) {
        StringBuffer sentenceReverse = new StringBuffer();
        int medida = texto.length();
        for (int i=0; i<medida; i++){
            sentenceReverse.append(texto.charAt(medida - 1 - i));
        }
        return sentenceReverse.toString();
    }

}

