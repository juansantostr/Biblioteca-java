package org.example.biblioteca;

public class Revista extends MaterialBiblioteca {
    private int numeroEdicion;

    public Revista() {}

    public Revista(String titulo, String autor, int anio, int numeroEdicion) {
        super(titulo, autor, anio);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }
    public void setNumeroEdicion(int numeroEdicion) { this.numeroEdicion = numeroEdicion; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de edición: " + numeroEdicion);
    }
}
