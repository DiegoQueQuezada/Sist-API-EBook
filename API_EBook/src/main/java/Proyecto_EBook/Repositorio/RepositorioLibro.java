package Proyecto_EBook.Repositorio;

import Proyecto_EBook.Dominio.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibro extends JpaRepository<Libro,Long> {

}
