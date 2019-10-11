package br.com.smanager.minierp.model.rest.facede;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.smanager.minierp.model.dao.ClienteDaoImplements;
import br.com.smanager.minierp.model.model.ClienteModel;
import br.com.smanager.minierp.model.model.VendedorModel;

@Path("/cliente")
@Produces({MediaType.APPLICATION_JSON,
			MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ClienteFacede {
	
	@Inject
	private ClienteDaoImplements clienteDaoImplements;

	@GET
	public List<ClienteModel>getClientes(){
		return clienteDaoImplements.getClientes();
	}

	@POST
	public ClienteModel gravarCliente(ClienteModel clienteNovo){
		clienteDaoImplements.gravarCliente(clienteNovo);
		return clienteNovo;
	}
	
	@PUT
	public void editarProduto(ClienteModel clienteEditado) {
		clienteDaoImplements.editarCliente(clienteEditado);
	}
	
	@DELETE
	@Path("/{codigocliente}")
	public void deletarProduto(@PathParam("codigocliente") Integer clienteDeletado) {
		ClienteModel clienteDeletar = new ClienteModel();
		clienteDeletar.setCodigocliente(clienteDeletado);
		clienteDaoImplements.deletarCliente(clienteDeletar);
	}

}
