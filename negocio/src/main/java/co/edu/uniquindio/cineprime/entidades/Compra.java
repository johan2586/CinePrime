package co.edu.uniquindio.cineprime.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private MedioPago medioPago;

    @Column(nullable = false)
    private LocalDateTime fecha;

    @Positive
    @Column(nullable = false)
    private Float valorTotal;
/*
    @ManyToMany
    private List<Confiteria> confiteria;
*/
    @OneToOne
    private Cupon cupon;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Funcion funcion;
/*
    @ManyToMany
    @JoinColumn(name = "entrada" ,
            joinColumns = @JoinColumn(name = "compra_codigo") ,
            inverseJoinColumns = @JoinColumn(name = "silla_sala_codigo")
    )
    private List<SillaSala> sillaSala;
*/
    public Compra(MedioPago medioPago, LocalDateTime fecha, List<Confiteria> confiteria, Cupon cupon, Usuario usuario, Funcion funcion, List<SillaSala> sillaSala) {
        this.medioPago = medioPago;
        this.fecha = fecha;
      //  this.confiteria = confiteria;
        this.cupon = cupon;
        this.usuario = usuario;
        this.funcion = funcion;
      //  this.sillaSala = sillaSala;
    }
}
