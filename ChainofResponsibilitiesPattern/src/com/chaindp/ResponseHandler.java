package com.chaindp;

public interface ResponseHandler {
	void handle(Response response);
	void setNextHandler(ResponseHandler handler);
}
