package Proyecto_EBook.Servicios;

import Proyecto_EBook.Dominio.Libro;

import java.util.ArrayList;
import java.util.List;

public interface ServicioLibro {


    Libro createLibro(Libro l);
    ArrayList<Libro> tenerTodosLosLibros();

}
