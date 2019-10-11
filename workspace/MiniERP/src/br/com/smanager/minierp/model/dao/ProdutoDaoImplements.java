package br.com.smanager.minierp.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.smanager.minierp.model.model.ProdutoModel;

public class ProdutoDaoImplements implements ProdutoDaoInterface{
	
	@PersistenceContext(unitName = "MiniERPPersistenceUnit")
	private EntityManager entityManager;

	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<ProdutoModel> getProdutos() {
		Query sql = entityManager.createQuery("from ProdutoModel");
		return sql.getResultList();
	}

	@Override
	@Transactional
	public ProdutoModel gravarProduto(ProdutoModel produtoModel) {
		entityManager.persist(produtoModel);
		return produtoModel;
	}

	@Override
	@Transactional
	public void editarProduto(ProdutoModel produtoModel) {
		ProdutoModel produtoModelEditar = entityManager.merge(produtoModel);
		entityManager.persist(produtoModelEditar);		
	}

	@Override
	@Transactional
	public void deletarProduto(ProdutoModel produtoModel) {
		ProdutoModel produtoModelDeletar = entityManager.merge(produtoModel);
		entityManager.remove(produtoModelDeletar);
	}

}
