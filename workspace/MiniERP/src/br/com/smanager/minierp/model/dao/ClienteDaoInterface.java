package br.com.smanager.minierp.model.dao;

import java.util.List;

import br.com.smanager.minierp.model.model.ClienteModel;

public interface ClienteDaoInterface {
	
	public List<ClienteModel> getClientes();
	ClienteModel gravarCliente(ClienteModel clienteModel);
	void editarCliente(ClienteModel clienteModel);
	void deletarCliente(ClienteModel clienteModel);

}
