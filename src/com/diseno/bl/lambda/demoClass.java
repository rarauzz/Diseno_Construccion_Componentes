package com.diseno.bl.lambda;

import com.amazonaws.services.lambda.runtime.Context;

import com.amazonaws.services.lambda.runtime.RequestHandler;

public class demoClass implements RequestHandler<LambdaRequest,LambdaResponse> {

	@Override
	public LambdaResponse handleRequest(LambdaRequest request, Context context) {
		
	LambdaResponse response = new LambdaResponse();
	
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
