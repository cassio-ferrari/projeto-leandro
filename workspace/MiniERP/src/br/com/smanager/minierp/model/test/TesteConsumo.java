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
		System.out.println("nada para inserir");
	}
	public void consultaPedido() {
		System.out.println("buscando pedido");
	}
}
