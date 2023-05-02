package org.artairg.Prototype;

public class Ejemplo_Prototype {
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario("Juan Perez", "Calle 123, Ciudad", "juan@example.com");

        try {
            Formulario formulario2 = formulario1.clone();
            formulario2.setNombre("Maria Gomez");
            formulario2.setDireccion("Avenida 456, Ciudad");
            formulario2.setCorreoElectronico("maria@example.com");

            System.out.println("Formulario 1: " + formulario1.getNombre() + ", " + formulario1.getDireccion() + ", " + formulario1.getCorreoElectronico());
            System.out.println("Formulario 2: " + formulario2.getNombre() + ", " + formulario2.getDireccion() + ", " + formulario2.getCorreoElectronico());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
