package com.mgrobelak.endpoints;

/**
 * @author Marcin Grobelak
 */

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mgrobelak.model.RequestInput;
import com.mgrobelak.model.RequestOutput;
import com.mgrobelak.response.creator.ResponseEntityCreator;

@Path("/request")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RequestEndpoint {

	@Inject
	private ResponseEntityCreator entityCreator;

	@GET
	public String get() {
		return "Use post method with JSON like: { \"mappingName\": \"ANIMALS\" , \"numbers\": [1,2,3] }";
	}

	@POST
	public Response post(RequestInput input) throws Exception {
		List<RequestOutput> output = entityCreator.create(input);
		return Response.status(Status.OK).entity(output).build();
	}

}