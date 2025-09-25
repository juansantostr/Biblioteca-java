package org.example.biblioteca;

public class Main {
    public static void main(String[] args) {
        MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];

        materiales[0] = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, "Ficción");
        materiales[1] = new Revista("National Geographic", "Varios", 2021, 134);
        materiales[2] = new Tesis("Modelos de IA", "María Pérez", 2024, "Universidad X");

        for (int i = 0; i < materiales.length; i++) {
            System.out.println("----- Material " + (i + 1) + " -----");
            materiales[i].mostrarInfo();
            System.out.println();
        }
    }
}
