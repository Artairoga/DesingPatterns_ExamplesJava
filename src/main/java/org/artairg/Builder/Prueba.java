package org.artairg.Builder;

public class Prueba {
    public static void main(String[] args) {
        //Aqui se pueden usar dos constructores,pero por ejemplo si se quiere crear un ordenador sin tarjeta grafica
        //se tendria que usar el constructor vacio y luego los setters, por lo que se tendria que crear un objeto
        //y luego modificarlo, en cambio con el builder se puede crear el objeto y modificarlo en la misma linea
        //Ordenador ordenador = new Ordenador("Asus", "Intel i7", "16 GB", "1 TB", "Nvidia 1080");
        Ordenador ordenador = new Ordenador()
                .setModelo("Asus")
                .setProcesador("Intel i7")
                .setMemoria("16 GB")
                .setDiscoDuro("1 TB");
        Ordenador ordenador2 = new Ordenador()
                .setModelo("Asus")
                .setProcesador("Intel i7")
                .setMemoria("16 GB")
                .setDiscoDuro("1 TB")
                .setTarjetaGrafica("Nvidia 1080");
        System.out.println(ordenador);
        System.out.println("--------------------------------------------------");
        System.out.println(ordenador2);
    }
}
