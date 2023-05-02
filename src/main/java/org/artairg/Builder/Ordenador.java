package org.artairg.Builder;

public class Ordenador {
    private String modelo;
    private String procesador;
    private String memoria;
    private String discoDuro;
    private String tarjetaGrafica;

    public Ordenador(String modelo, String procesador, String memoria, String discoDuro, String tarjetaGrafica) {
        this.modelo = modelo;
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public Ordenador() {

    }
    // getters y setters

    public String getModelo() {
        return modelo;
    }

    public Ordenador setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getProcesador() {
        return procesador;
    }

    public Ordenador setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public String getMemoria() {
        return memoria;
    }

    public Ordenador setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public Ordenador setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
        return this;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public Ordenador setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria='" + memoria + '\'' +
                ", discoDuro='" + discoDuro + '\'' +
                ", tarjetaGrafica='" + tarjetaGrafica + '\'' +
                '}';
    }
}
