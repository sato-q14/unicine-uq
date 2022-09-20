package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String isbn;

    @Column(nullable = false)
    private String nombre;

    @PositiveOrZero
    private int unidades;

    @PositiveOrZero
    private int anio;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;


}
