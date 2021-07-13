package com.company;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table( name = "libros")
public class Libro {
    @Id
    private int isbn;
    private Autor autor;
    private String nombreLibro;
    private String categoria;
    private String editorial;
    private int anioDePublicacion;

    public Libro() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombreLibro;
    }

    public void setNombre(String nombre) {
        this.nombreLibro = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", autor=" + autor +
                ", nombre='" + nombreLibro + '\'' +
                ", categoria='" + categoria + '\'' +
                ", editorial='" + editorial + '\'' +
                ", anioDePublicacion=" + anioDePublicacion +
                '}';
    }
}
