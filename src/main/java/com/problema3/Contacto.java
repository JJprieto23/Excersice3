package com.problema3;

class Contacto {
    private String nombre;
    private String numeroTelefono;
    private String correoElectronico;

    public Contacto(String nombre, String numeroTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + numeroTelefono + ", Email: " + correoElectronico;
    }
}
