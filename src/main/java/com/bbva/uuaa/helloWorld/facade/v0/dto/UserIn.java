package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserIn {

    @NotNull
    private String dni;

    @NotEmpty
    @Pattern(regexp = "^[A-Z]+$")
    private String nombre;

    @NotNull
    @Pattern(regexp = "^[A-Z]*$")
    private String apellido;

    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    private String correo;

    @NotNull
    @Pattern(regexp = "^[0-9]{10}$", message = "El número de teléfono debe tener exactamente 10 dígitos")
    private String celular;
}
