package co.edu.uniquindio.cineprime.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cupon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Positive
    @Column(nullable = false)
    private Float descuento;

    @Column(nullable = false)
    private LocalDateTime fechaVEncimiento;

    @Column(nullable = false)
    private Boolean estado;

    @OneToOne(mappedBy = "cupon")
    private Compra compra;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;

    @Builder

    public Cupon(Float descuento, LocalDateTime fechaVEncimiento, Boolean estado, Usuario usuario) {
        this.descuento = descuento;
        this.fechaVEncimiento = fechaVEncimiento;
        this.estado = estado;
        this.usuario = usuario;
    }
}
