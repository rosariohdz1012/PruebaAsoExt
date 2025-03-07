package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseNoContent;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DateIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DateOut;

import javax.validation.Valid;
import javax.xml.ws.Service;

public interface ISrvHelloWorld {
	
	ServiceResponseCreated<DateOut> crear(@Valid DateIn dateIn);


}
