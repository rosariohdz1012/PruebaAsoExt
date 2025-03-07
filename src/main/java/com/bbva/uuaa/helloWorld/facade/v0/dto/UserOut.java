package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserOut {
    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;

}
