package com.chaindp;

public class JSONResponseHandler extends AbstractResponseHandler {

	@Override
	public void handle(Response response) {
		if(response.responseType.equals(ResponseType.JSON)) {
			System.out.println("Processing JSON response" + response.responseMessage);
			return;
		}
		this.nextHandler.handle(response);
	}

}
