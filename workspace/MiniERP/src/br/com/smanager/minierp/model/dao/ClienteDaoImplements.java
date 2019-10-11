package br.com.smanager.minierp.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.smanager.minierp.model.model.ClienteModel;

public class ClienteDaoImplements implements ClienteDaoInterface{
	
	@PersistenceContext(unitName = "MiniERPPersistenceUnit")
	private EntityManager entityManager;
	
	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<ClienteModel> getClientes() {
		Query sql = entityManager.createQuery("from ClienteModel");
		return sql.getResultList();
	}

	@Override
	@Transactional
	public ClienteModel gravarCliente(ClienteModel clienteModel) {
		entityManager.persist(clienteModel);
		return clienteModel;
	}

	@Override
	@Transactional
	public void editarCliente(ClienteModel clienteModel) {
		ClienteModel clienteModelAlterar = entityManager.merge(clienteModel);
		entityManager.persist(clienteModelAlterar);		
	}

	@Override
	@Transactional
	public void deletarCliente(ClienteModel clienteModel) {
		ClienteModel clienteModelDeletar = entityManager.merge(clienteModel);
		entityManager.remove(clienteModelDeletar);
	}

}
