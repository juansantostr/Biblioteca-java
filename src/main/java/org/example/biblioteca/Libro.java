package org.example.biblioteca;

public class Libro extends MaterialBiblioteca {
    private String genero;

    // Constructor vacío
    public Libro() {}

    // Constructor con parámetros
    public Libro(String titulo, String autor, int anio, String genero) {
        super(titulo, autor, anio);
        this.genero = genero;
    }

    // Getter y setter
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género: " + genero);
    }
}
