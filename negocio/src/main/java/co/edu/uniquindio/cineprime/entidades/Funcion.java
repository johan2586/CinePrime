package co.edu.uniquindio.cineprime.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Funcion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;
/*
    @ManyToOne
    @JoinColumn(nullable = false)
    private Sala sala;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Horario horario;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Pelicula pelicula;
*/
    @OneToMany(mappedBy = "funcion")
    private List<Compra> compras;

    public Funcion(Integer codigo, List<Compra> compras) {
        this.codigo = codigo;
        this.compras = compras;
    }
    /*
    @Builder

    public Funcion(Sala sala, Horario horario, Pelicula pelicula) {
        this.sala = sala;
        this.horario = horario;
        this.pelicula = pelicula;
    }
    */

}
