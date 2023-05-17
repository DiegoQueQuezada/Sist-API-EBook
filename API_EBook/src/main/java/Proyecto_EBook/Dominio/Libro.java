package Proyecto_EBook.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name="libros")
@Data   //Generar en tiempo de modificacion
@NoArgsConstructor  //Genere un constructor VACIO
@AllArgsConstructor //Genere un constructor con TODOS los atributos
@ToString
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="titulo",nullable = false)
    private String titulo;
    @Column(name="autor",nullable = false)
    private String autor;
    @Column(name="imageURL",nullable = false)
    private String imagenURL;
    @Column(name="descripcion",nullable = false)
    private String descripcion;
    @Column(name="tiempoCreacion")
    private LocalDateTime tiempoCreacion;
    @Column(name="tiempoModificacion")
    private LocalDateTime tiempoModificacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagenURL() {
        return imagenURL;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getTiempoCreacion() {
        return tiempoCreacion;
    }

    public void setTiempoCreacion(LocalDateTime tiempoCreacion) {
        this.tiempoCreacion = tiempoCreacion;
    }

    public LocalDateTime getTiempoModificacion() {
        return tiempoModificacion;
    }

    public void setTiempoModificacion(LocalDateTime tiempoModificacion) {
        this.tiempoModificacion = tiempoModificacion;
    }
}
