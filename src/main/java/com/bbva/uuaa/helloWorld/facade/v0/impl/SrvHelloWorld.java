package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseNoContent;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDateIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDateOut;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DateIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DateOut;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvHelloWorldMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@SN (registryID = "SNGG20240019", logicalID = "helloWorld")
@VN (vnn = "v0")
@Path ("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {
	
	@Autowired
	private IBSrvHelloWorld business;
	@Override
	@POST
	@Path ("/crearUsuario")
	@Produces ({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@SMC (registryID = "SNGG20240029", logicalID = "usuario")
	public ServiceResponseCreated<DateOut> crear(@Valid DateIn dateIn)  {
		ISrvHelloWorldMapper mapper = Mappers.getMapper(ISrvHelloWorldMapper.class);
		BDateIn bDateIn = mapper.datosEntradaB(dateIn);
		BDateOut bDateOut = business.mapBusiness(bDateIn);
		DateOut dateOut = mapper.bDatosSalidaB(bDateOut);
		return ServiceResponseCreated.data(dateOut).build();
	}

//	@Override
//	@PUT
//	@Path ("/actualizarUsuario")
//	@Produces ({MediaType.APPLICATION_JSON})
//	@Consumes({MediaType.APPLICATION_JSON})
//	@SMC (registryID = "SNGG20240030", logicalID = "actualizarUsuario")
//	public ServiceResponseNoContent actualizar (@Valid DateIn dateIn)  {
//
//		ISrvHelloWorldMapper mapper = Mappers.getMapper(ISrvHelloWorldMapper.class);
//		BDateIn bDateIn = mapper.datosEntradaB(dateIn);
//		BDateOut bDateOut = business.mapBusiness(bDateIn);
//
//		return ServiceResponseNoContent.ServiceResponseNoContentBuilder.build();
//
//	}

}
