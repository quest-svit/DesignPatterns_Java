package com.chaindp;

public class XMLResponseHandler extends AbstractResponseHandler {

	@Override
	public void handle(Response response) {
		if(response.responseType.equals(ResponseType.XML)) {
			System.out.println("Processing XML response " + response.responseMessage);
			return;
		}
		this.nextHandler.handle(response);
	}

}
