package org.artairg.Decorator;

public class ConLeche implements Bebida{

        private Bebida bebida;

        public ConLeche(Bebida bebida) {
            this.bebida = bebida;
        }

        @Override
        public String getDescripcion() {
            return bebida.getDescripcion() + " con leche";
        }

        @Override
        public int getPrecio() {
            return bebida.getPrecio() + 5;
        }
}
