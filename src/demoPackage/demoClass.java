package demoPackage;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class demoClass implements RequestHandler<LambdaRequest,LambdaResponse> {

	@Override
	public LambdaResponse handleRequest(LambdaRequest request, Context context) {
		
	LambdaResponse response = new LambdaResponse();
	
	if (request.getOption().equals("1")) {
		response.setNombre("Rodri");
		response.setApellidos("Arauz");
	}else {
		response.setNombre("Clark");
		response.setApellidos("Kent");
	}

	return response;
	}
	

}
