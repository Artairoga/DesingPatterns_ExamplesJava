package org.artairg.Decorator;

public class Cafe implements Bebida{

    @Override
    public String getDescripcion() {
        return "Cafe";
    }

    @Override
    public int getPrecio() {
        return 10;
    }
}
