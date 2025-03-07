package com.bbva.uuaa.helloWorld.facade.v0.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class DateIn implements Serializable {

    @Valid
    private List<UserIn> userIn;

}
