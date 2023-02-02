package com.cumple;

public class persona {
    protected String nombre;
    protected Integer nacimiento;

    public persona() {
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
