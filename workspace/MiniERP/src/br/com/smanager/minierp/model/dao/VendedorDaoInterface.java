package br.com.smanager.minierp.model.dao;

import java.util.List;

import br.com.smanager.minierp.model.model.VendedorModel;

public interface VendedorDaoInterface {
	
	public List<VendedorModel> getVendedores();
	VendedorModel gravarVendedor(VendedorModel vendedorModel);
	void editarVendedor(VendedorModel vendedorModel);
	void deletarVendedor(VendedorModel vendedorModel);
}
