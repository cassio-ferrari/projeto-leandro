package br.com.smanager.minierp.model.rest.facede;

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

import br.com.smanager.minierp.model.dao.ProdutoDaoImplements;
import br.com.smanager.minierp.model.model.ProdutoModel;

@Path("/produto")
@Produces({MediaType.APPLICATION_JSON,
			MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ProdutoFacede {
	@Inject
	private ProdutoDaoImplements produtoDaoImplements;
	
	@GET
	public List<ProdutoModel> getProdutos(){
		return produtoDaoImplements.getProdutos();
	}
	
	@POST
	public ProdutoModel gravarProduto(ProdutoModel produtoModel) {
		return produtoDaoImplements.gravarProduto(produtoModel);
	}
	
	@PUT
	public void editarProduto(ProdutoModel produtoModel) {
		produtoDaoImplements.editarProduto(produtoModel);
	}
	
	@DELETE
	@Path("/{codigoproduto}")
	public void deletarProduto(@PathParam("codigoproduto") Integer codigoProduto) {
		ProdutoModel produtoModel = new ProdutoModel();
		produtoModel.setCodigoproduto(codigoProduto);
		produtoDaoImplements.deletarProduto(produtoModel);
	}
}
