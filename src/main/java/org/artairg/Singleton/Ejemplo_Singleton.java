package org.artairg.Singleton;

public class Ejemplo_Singleton {
    public static void main(String[] args) {
        Configuracion configuracion1 = Configuracion.getInstancia();
        Configuracion configuracion2 = Configuracion.getInstancia();

        configuracion1.setUrlBase("http://example.com");

        System.out.println("Configuracion 1: " + configuracion1.getUrlBase() + ", " + configuracion1.getNombreUsuario() + ", " + configuracion1.getContrasena());
        System.out.println("Configuracion 2: " + configuracion2.getUrlBase() + ", " + configuracion2.getNombreUsuario() + ", " + configuracion2.getContrasena());
    }
}
