package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDateIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDateOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DateIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DateOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.UserIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.UserOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISrvHelloWorldMapper {

    @Mapping(target = "dni", source = "dni")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "apellido", source = "apellido")
    @Mapping(target = "correo", source = "correo")
    @Mapping(target = "celular", source = "celular")
    BUserIn userEntradaBusi (UserIn userIn);

    List<BUserIn> mapUserInListToBUserInList(List<UserIn> userInList);

    @Mapping(target = "dni", source = "dni")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "apellido", source = "apellido")
    @Mapping(target = "correo", source = "correo")
    @Mapping(target = "celular", source = "celular")
    UserOut bUserSalidaBusi (BUserOut bUserout);

    List<UserOut> mapBUserOutListToUserOutList(List<BUserOut> bUserOutList);

    @Mapping(target = "userIn", source = "userIn")
    BDateIn datosEntradaB (DateIn dateIn);

    @Mapping(target = "userOut", source = "userOut")
    DateOut bDatosSalidaB (BDateOut bDateOut);


}
