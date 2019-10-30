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

import br.com.smanager.minierp.model.dao.PedidoDaoImplements;
import br.com.smanager.minierp.model.model.PedidoModel;

@Path("/pedido")
@Produces({MediaType.APPLICATION_JSON,
			MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class PedidoFacede {
	
	@Inject
	private PedidoDaoImplements pedidoDaoImplements;
	
	@GET
	public List<PedidoModel> getPedido() {
		return pedidoDaoImplements.getPedidos();
	}
	
	@POST
	public PedidoModel gravarPedido(PedidoModel pedidoNovo) {
		return pedidoDaoImplements.gravarPedido(pedidoNovo);
	}
	
	@PUT
	public void editarPedido(PedidoModel pedidoAlterado) {
		pedidoDaoImplements.editarPedido(pedidoAlterado);
	}
	
	@DELETE
	@Path("/{numeropedido}")
	public void deletarPedido(@PathParam("numeropedido") Long pedidoDeletado) {
		PedidoModel pedidoDeletar = new PedidoModel();
		pedidoDeletar.setNumeropedido(pedidoDeletado);
		pedidoDaoImplements.deletarPedido(pedidoDeletar);
	}
}
