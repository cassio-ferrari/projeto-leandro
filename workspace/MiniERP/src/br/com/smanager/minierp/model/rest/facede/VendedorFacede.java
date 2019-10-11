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

import br.com.smanager.minierp.model.dao.VendedorDaoImplements;
import br.com.smanager.minierp.model.model.VendedorModel;

@Path("/vendedor")
@Produces({MediaType.APPLICATION_JSON,
			MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class VendedorFacede {
	
	@Inject
	private VendedorDaoImplements vendedorDaoImplements;
	
	@GET
	public List<VendedorModel>getVendedores(){
		return vendedorDaoImplements.getVendedores();
	}
	
	@POST
	public VendedorModel gravarVendedor(VendedorModel vendedorNovo){
		vendedorDaoImplements.gravarVendedor(vendedorNovo);
		return vendedorNovo;
	}
	
	@PUT
	public void editarVendedor(VendedorModel vendedorEditado) {
		vendedorDaoImplements.editarVendedor(vendedorEditado);
	}
	
	@DELETE
	@Path("/{codigovendedor}")
	public void deletarVendedor(@PathParam("codigovendedor") Integer vendedorDeletado) {
		VendedorModel vendedorDeletar = new VendedorModel();
		vendedorDeletar.setCodigovendedor(vendedorDeletado);
		vendedorDaoImplements.deletarVendedor(vendedorDeletar);
	} 
}
