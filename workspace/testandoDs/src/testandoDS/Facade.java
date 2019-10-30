package testandoDS;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/banco")
@Produces({MediaType.APPLICATION_JSON, 
		   MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class Facade {
	
	@Inject
	private SqlData result;
	
	@GET
	public String retornoBanco() {
		return result.resultado();
	}
	
}
