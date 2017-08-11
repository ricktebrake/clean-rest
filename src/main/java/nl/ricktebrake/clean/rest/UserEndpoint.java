package nl.ricktebrake.clean.rest;

import nl.ricktebrake.clean.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.UUID;

@Path("/users")
public class UserEndpoint {

    @GET
    @Path("/${userId}")
    @Produces("application/json")
    public User getUser(@PathParam("userId") String id) {

       return new User(UUID.randomUUID().toString());

    }

}

