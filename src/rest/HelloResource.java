package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloResource
{
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting helloWorld()
    {
        return new Greeting("Hello","World");
    }
	 
	@Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting helloWorld(@PathParam("id") String id)
    {
        return new Greeting("Hello",id);
    }
}