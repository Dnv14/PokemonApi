package com.example.PokemonApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio y no puede estar vacío")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El tipo es obligatorio")
    private String tipo;

    @NotNull(message = "El nivel es obligatorio")
    @Min(value = 1, message = "Nivel mínimo es 1")
    @Max(value = 100, message = "Nivel máximo es 100")
    private Integer nivel;

    @Min(value = 0, message = "ataque mínimo es 1")
    private Integer ataque;

    @Min(value = 0, message = "defensa mínima es 1")
    private Integer defensa;

    @Size(max = 100, message = "Máximo de caracteres descriptivos: 100")
    private String descripcion;

    @URL(message = "La imagen debe ser una URL válida")
    private String imagenUrl;

    @Email(message = "El email no tiene el formato correcto")
    private String email;
}
