package br.com.smanager.minierp.model.dao;

import java.util.List;

import br.com.smanager.minierp.model.model.ProdutoModel;

public interface ProdutoDaoInterface {
	
	public List<ProdutoModel> getProdutos();
	ProdutoModel gravarProduto(ProdutoModel produtoModel);
	void editarProduto(ProdutoModel produtoModel);
	void deletarProduto(ProdutoModel produtoModel);
}
