package br.com.smanager.minierp.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.smanager.minierp.model.model.VendedorModel;

public class VendedorDaoImplements implements VendedorDaoInterface{
	
	@PersistenceContext(unitName = "MiniERPPersistenceUnit")
	private EntityManager entityManager;

	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<VendedorModel> getVendedores() {
		Query sql = entityManager.createQuery("from VendedorModel");
		return sql.getResultList();
	}

	@Override
	@Transactional
	public VendedorModel gravarVendedor(VendedorModel vendedorModel) {
		entityManager.persist(vendedorModel);
		return vendedorModel;
	}

	@Override
	@Transactional
	public void editarVendedor(VendedorModel vendedorModel) {
		VendedorModel vendedorModelEditar = entityManager.merge(vendedorModel);
		entityManager.persist(vendedorModelEditar);
	}

	@Override
	@Transactional
	public void deletarVendedor(VendedorModel vendedorModel) {
		VendedorModel vendedorModelDeletar = entityManager.merge(vendedorModel);
		entityManager.remove(vendedorModelDeletar);
	}

}
