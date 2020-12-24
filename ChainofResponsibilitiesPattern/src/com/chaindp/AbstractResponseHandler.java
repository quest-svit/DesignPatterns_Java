package com.chaindp;

public abstract class AbstractResponseHandler implements ResponseHandler {

	protected ResponseHandler nextHandler;
	
	@Override
	public void setNextHandler(ResponseHandler nexthandler) {
		this.nextHandler = nexthandler;

	}

}
