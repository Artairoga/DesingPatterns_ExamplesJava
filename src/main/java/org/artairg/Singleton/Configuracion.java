package org.artairg.Singleton;

public class Configuracion {
    private static Configuracion instancia = null;

    private String urlBase;
    private String nombreUsuario;
    private String contrasena;

    private Configuracion() {
        this.urlBase = "http://localhost";
        this.nombreUsuario = "admin";
        this.contrasena = "password";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

