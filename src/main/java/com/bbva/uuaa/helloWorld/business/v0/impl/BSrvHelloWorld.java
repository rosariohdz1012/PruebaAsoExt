package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDateIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDateOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.UserIn;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BSrvHelloWorld implements IBSrvHelloWorld {

    @Override
    public BDateOut mapBusiness(BDateIn bDateIn) {
        BDateOut bDateOut = new BDateOut();
        List<BUserOut> buserOutList = new ArrayList<>();
        for (BUserIn userIn : bDateIn.getUserIn()) {
            BUserOut userOut = new BUserOut();
            userOut.setDni(userIn.getDni());
            userOut.setNombre(userIn.getNombre());
            userOut.setApellido(userIn.getApellido());
            userOut.setCorreo(userIn.getCorreo());
            userOut.setCelular(userIn.getCelular());
            buserOutList.add(userOut);
        }
        bDateOut.setUserOut(buserOutList);
        return bDateOut;
    }
}
