package br.com.smanager.minierp.model.dao;

import java.util.List;

import br.com.smanager.minierp.model.model.PedidoModel;

public interface PedidoDaoInterface {
	
	public List<PedidoModel> getPedidos();
	PedidoModel gravarPedido(PedidoModel pedidoModel);
	void editarPedido(PedidoModel pedidoModel);
	void deletarPedido(PedidoModel pedidoModel);

}
