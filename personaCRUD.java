package com.cumple;

import com.sininterfaces.Empleado;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;

public interface personaCRUD {
    void save(persona persona);
    HashMap<String, Integer> findAll();
    void findAllArchive(PrintStream archive);
    void delete(String key);
}
