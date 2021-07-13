package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        List<Libro> libros = (List<Libro>) session.createQuery("FROM Libros").getResultList();

        System.out.println("Productos en mi base: ");
        for(Libro l:libros)
            System.out.println(l);    }
}
