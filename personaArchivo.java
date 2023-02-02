package com.cumple;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class personaArchivo implements personaCRUD {
    HashMap<String,Integer> person = new HashMap<>();
    @Override
    public void save(persona persona) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nombre de la persona: "); persona.nombre = scan.nextLine();
        System.out.print("A=>o de nacimiento: "); persona.nacimiento = scan.nextInt();
        person.put(persona.nombre,persona.nacimiento);
    }
    public HashMap<String, Integer> findAll(){
        return person;
    };

    @Override
    public void findAllArchive(PrintStream archive){
        for(Map.Entry<String, Integer> persona: person.entrySet() ){
                archive.println("Nombre: "+persona.getKey()+"\tNacimiento: "+persona.getValue()+"\n\n");
        }
    }

    @Override
    public void delete(String key) {
        person.remove(key);
    }
}
