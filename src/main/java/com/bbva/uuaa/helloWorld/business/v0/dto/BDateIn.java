package com.bbva.uuaa.helloWorld.business.v0.dto;

import com.bbva.uuaa.helloWorld.facade.v0.dto.UserIn;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BDateIn {
    private List<BUserIn> userIn;
}
