package com.diseno.classes;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class demoClass implements RequestHandler<LambdaRequest,Persona> {

	@Override
	public Persona handleRequest(LambdaRequest request, Context context) {
		
	Persona response = new Persona();
	
	if (request.getOption().equals("1")) {
		response.setNombre("Rodri");
		response.setApellidos("Arauz");
		response.setEdad(32);
		response.setPeso(90);
		response.setMasaMuscular(35);
	}
	return response;
	}
	

}
