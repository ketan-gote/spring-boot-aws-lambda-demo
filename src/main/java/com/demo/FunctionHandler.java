package com.demo;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

@Component	
public class FunctionHandler implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
	
    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
    	final String msg = "Hello! Reached the Spring ServerLess Function with message: " + input.getBody();
    	System.out.println("Sending Response="+msg);
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setStatusCode(200);
        responseEvent.setBody(msg);
        return responseEvent;
    }
}