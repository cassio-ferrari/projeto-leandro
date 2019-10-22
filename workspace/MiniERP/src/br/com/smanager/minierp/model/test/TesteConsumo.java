package br.com.smanager.minierp.model.test;

import java.util.ArrayList;
import java.util.List;

import br.com.smanager.minierp.model.model.ClienteModel;
import br.com.smanager.minierp.model.model.PedidoModel;
import br.com.smanager.minierp.model.model.PedidoProdutoModel;
import br.com.smanager.minierp.model.model.ProdutoModel;
import br.com.smanager.minierp.model.rest.facede.PedidoFacede;


public class TesteConsumo{
			
	static PedidoModel pedidoModel = new PedidoModel();
	static List<PedidoProdutoModel> pedidoProdutoModel = new ArrayList<PedidoProdutoModel>();
	static ProdutoModel produtoModel1 = new ProdutoModel();
	static ProdutoModel produtoModel2 = new ProdutoModel();
	static ClienteModel clienteModel = new ClienteModel();
	
	public void inserePedido(){
		
		produtoModel1.setCodigoproduto(1);
		PedidoProdutoModel pedidoProdutoModelItem1 = new PedidoProdutoModel(produtoModel1, 10.00f, 10.00f, 100.00f);
		pedidoProdutoModel.add(pedidoProdutoModelItem1);
				
		produtoModel2.setCodigoproduto(2);
		PedidoProdutoModel pedidoProdutoModelItem2 = new PedidoProdutoModel(produtoModel2, 10f, 10.00f, 100.00f);
		pedidoProdutoModel.add(pedidoProdutoModelItem2);
		
		clienteModel.setCodigocliente(1);
		
		pedidoModel.setClienteModel(clienteModel);
		pedidoModel.setProdutos(pedidoProdutoModel);
		pedidoModel.setValortotalpedido(200.00f);
		
		PedidoFacede gravarPedido = new PedidoFacede();
		gravarPedido.gravarPedido(pedidoModel);
	}
}
