package nl.ricktebrake.clean.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/users/${userId}/tasks")
public class TaskEndpoint {

	@GET
	@Produces("application/json")
	public Response get() {
		return Response.ok("Hello Inge :) Free cuddles upstairs!").build();
	}
}