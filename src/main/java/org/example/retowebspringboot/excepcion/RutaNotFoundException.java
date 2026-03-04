package org.example.retowebspringboot.excepcion;

public class RutaNotFoundException extends RuntimeException {
    public RutaNotFoundException(String mensaje) {
        super(mensaje);
    }
}
