package br.com.smanager.minierp.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.smanager.minierp.model.model.PedidoModel;

public class PedidoDaoImplements implements PedidoDaoInterface{

	@PersistenceContext(unitName = "MiniERPPersistenceUnit")
	private EntityManager entityManager;
	
	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<PedidoModel> getPedidos() {
		Query sql = entityManager.createQuery("from PedidoModel"); 
		return sql.getResultList();
	}

	@Override
	@Transactional
	public PedidoModel gravarPedido(PedidoModel pedidoModel) {
		entityManager.persist(pedidoModel);
		return pedidoModel;
	}

	@Override
	@Transactional
	public void editarPedido(PedidoModel pedidoModel) {
		PedidoModel pedidoModelEditar = entityManager.merge(pedidoModel);
		entityManager.persist(pedidoModelEditar);
	}

	@Override
	@Transactional
	public void deletarPedido(PedidoModel pedidoModel) {
		PedidoModel pedidoModelDeletar = entityManager.merge(pedidoModel);
		entityManager.remove(pedidoModelDeletar);
	}

}
