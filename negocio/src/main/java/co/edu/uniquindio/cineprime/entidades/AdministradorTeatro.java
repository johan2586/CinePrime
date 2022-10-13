package co.edu.uniquindio.cineprime.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
public class AdministradorTeatro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo", nullable = false)
    private Long codigo;


    @Email
    @Column(length = 50,nullable = false,unique = true)
    @NotBlank
    private String correo;



    @Column(length = 30,nullable = false)
    @NotBlank
    private String contraseña;

    @OneToMany
    private List<Teatro> teatros;


}
