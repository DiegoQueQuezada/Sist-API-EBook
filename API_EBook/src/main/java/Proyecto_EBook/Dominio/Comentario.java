package Proyecto_EBook.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="comentarios")
@Data   //Generar en tiempo de modificacion
@NoArgsConstructor  //Genere un constructor VACIO
@AllArgsConstructor //Genere un constructor con TODOS los atributos
@ToString
public class Comentario {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="titulo",nullable = false)
    private String titulo;
    @Column(name="comentario",nullable = false)
    private String comentario;
    @Column(name="rating",nullable = false)
    private Integer rating;
    @ManyToOne
    @JoinColumn(name = "id_libro",nullable = false)
    private Libro libro;
}
