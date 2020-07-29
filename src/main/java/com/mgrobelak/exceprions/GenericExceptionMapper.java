package com.mgrobelak.exceprions;

/**
 * @author Marcin Grobelak
 */

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.mgrobelak.model.ErrorMessage;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessage message = new ErrorMessage(500, exception.getMessage());
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(message).build();
	}

}
