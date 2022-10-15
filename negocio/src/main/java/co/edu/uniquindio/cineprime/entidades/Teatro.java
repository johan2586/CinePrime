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
public class Teatro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(nullable = false, length = 100)
    private String direccion;

    @Column(nullable = false, length = 20)
    private String telefono;
/*
    @ManyToMany
    @JoinColumn(nullable = false)
    private Ciudad ciudad;
*/

    @ManyToOne
    @JoinColumn(nullable = false)
    private AdministradorTeatro administrador;
/*
    @OneToMany(mappedBy = "teatro")
    private List<Sala> salas;
*/
    @Builder

    public Teatro(String direccion, String telefono, Ciudad ciudad, AdministradorTeatro administrador) {
        this.direccion = direccion;
        this.telefono = telefono;
        //this.ciudad = ciudad;
        this.administrador = administrador;
    }
}
