package co.edu.uniquindio.cineprime.entidades;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Usuario extends Persona implements Serializable {
    @ElementCollection
    private List<String> telefono;


    @ManyToOne
    @JoinColumn(name = "codigoCiudad", nullable = true)
    private Ciudad ciudad;

    @ToString.Include
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    @NotNull
    private int cedula;

    public Usuario(String nombre, @Email String email, String contraseña, int cedula) {
        super(nombre, email, contraseña);
        this.cedula = cedula;
    }

}