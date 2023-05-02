package org.artairg.Decorator;

public class Ejemplo_Decorator {
    public static void main(String[] args) {
        Bebida cafe=new Cafe();
        System.out.println(cafe.getDescripcion());
        System.out.println(cafe.getPrecio());
        Bebida cafeConLeche=new ConLeche(new Cafe());
        System.out.println(cafeConLeche.getDescripcion());
        System.out.println(cafeConLeche.getPrecio());

    }
}
