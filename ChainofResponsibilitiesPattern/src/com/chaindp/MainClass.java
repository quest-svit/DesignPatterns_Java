package com.chaindp;

public class MainClass {

	public static void main(String[] args) {
		
		MainClass obj = new  MainClass();
		ResponseHandler responseHandler = obj.getValidHandlers();
		Response xmlResponse =  new Response(ResponseType.XML , "<testxml>testMessage</textxml>");
		Response jsonResponse =  new Response(ResponseType.JSON , " {message : testMessage}");

		responseHandler.handle(xmlResponse);
		responseHandler.handle(jsonResponse);
	}
	
	public ResponseHandler getValidHandlers() {
		ResponseHandler  xmlHandler =  new XMLResponseHandler();
		ResponseHandler  jsonHandler =  new JSONResponseHandler();
		
		xmlHandler.setNextHandler(jsonHandler);
		return xmlHandler;
	}
}
