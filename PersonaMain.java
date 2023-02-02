package com.cumple;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        personaCRUD userCRUD = new personaArchivo();
        System.out.print("Cuantos coches quieres agregar: "); int nAgregados = scan.nextInt();
        for(int i=0; i<nAgregados; i++){
            System.out.println("Datos basicos de la persona "+(i+1));
            userCRUD.save(new persona());
        }

        System.out.println(userCRUD.findAll());

        //Imprimir en un archivo
        try {
            PrintStream archive = new PrintStream("/C:/Users/jwsb1/OneDrive/Escritorio/Cumple.txt");
            userCRUD.findAllArchive(archive);
            archive.close();
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion: "+e.getMessage());
        }

    }
}
