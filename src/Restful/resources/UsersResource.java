package Restful.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;

import  Restful.user.model.User;
import  Restful.user.model.Container;

@Path("/user")
public class UsersResource {
	  private Container container = new Container(); // mock the users info
	  private Map<String, User> allUsers = container.getAllUsers();
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Hello Jersey";
	  }
	  

	  
	  @PUT
	  @Path("/{id}")
	  public Response  changeUser(@PathParam("name") String name) throws IOException {
		  String output = "PUT: Jersey say : " + name;
	        return Response.status(200).entity(output).build();	   
	  }

	  @GET
	  @Path("{id}")
	  public String getUser(@PathParam("id") String id) {
	    // return new TodoResource(uriInfo, request, id);
		  try {
			User user = allUsers.get(id);
			  return "User id: " + user.getId() + " \nUser name: " + user.getName();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "id is not valid one!!";
		}
	  }

	}
