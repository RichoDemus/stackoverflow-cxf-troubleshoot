package com.richo.merlin.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface WebApi
{
	@GET
	@Path("/{id}/")
	String getStuff(@PathParam("id") String id);
}
	