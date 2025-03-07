package com.bbva.uuaa.helloWorld.business.v0;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDateIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDateOut;

public interface IBSrvHelloWorld {

    BDateOut mapBusiness(BDateIn dateIn);
}
