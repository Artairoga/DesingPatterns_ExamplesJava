package org.artairg.Prototype;

public class Formulario implements Cloneable {
    private String nombre;
    private String direccion;
    private String correoElectronico;

    public Formulario(String nombre, String direccion, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    @Override
    public Formulario clone() throws CloneNotSupportedException {
        return (Formulario) super.clone();
    }
}

