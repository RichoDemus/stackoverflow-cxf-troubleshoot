package com.richo.merlin.web.api;

import com.richo.merlin.api.WebApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/web")
public class WebApiServer implements WebApi
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@GET
	@Path("/{id}/")
	public String getStuff(@PathParam("id") String id)
	{
		logger.info("get called with args {}", id);
		return "asdf";
	}
}
