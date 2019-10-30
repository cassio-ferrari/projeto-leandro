package br.com.smanager.minierp.model.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity //(name = "PedidoProdutoModel")
@Table(name = "pedido_produto")
public class PedidoProdutoModel {
	
	//@Id
	//@Column(name = "codigo_pedidoproduto")
	@EmbeddedId
	private PedidoProdutoIdModel pedidoProdutoIdModel;
	
	//@JoinColumn(name = "numeropedido_pedidoproduto", nullable = false, referencedColumnName = "numero_pedido")
	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("numeropedido")
	private PedidoModel pedidoModel;
	
	//@JoinColumn(name = "produto_pedidoproduto", nullable = false, referencedColumnName = "codigo_produto")
	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("codigoproduto")
	ProdutoModel produtoModel;
	
	@Column(name = "qtde_pedidoproduto", nullable = false)
	Float qtdepedidoproduto;
	
	@Column(name = "valorunitario_pedidoproduto", nullable = false)
	Float valorunitariopedidoproduto;
	
	@Column(name = "valortotal_pedidoproduto", nullable = false)
	Float valortotalpedidoproduto;
	
	@Column(name = "unidade_pedidoproduto", nullable = true, length = 6)
	String unidadepedidoproduto;

	public PedidoProdutoModel() {}
	public PedidoProdutoModel(PedidoModel pedidoModel,
			ProdutoModel produtoModel, Float qtdepedidoproduto, Float valorunitariopedidoproduto,
			Float valortotalpedidoproduto, String unidadepedidoproduto) {
		super();
		this.pedidoProdutoIdModel = new PedidoProdutoIdModel(pedidoModel.getNumeropedido(), produtoModel.getCodigoproduto());
		this.pedidoModel = pedidoModel;
		this.produtoModel = produtoModel;
		this.qtdepedidoproduto = qtdepedidoproduto;
		this.valorunitariopedidoproduto = valorunitariopedidoproduto;
		this.valortotalpedidoproduto = valortotalpedidoproduto;
		this.unidadepedidoproduto = unidadepedidoproduto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedidoModel == null) ? 0 : pedidoModel.hashCode());
		result = prime * result + ((produtoModel == null) ? 0 : produtoModel.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoProdutoModel other = (PedidoProdutoModel) obj;
		if (pedidoModel == null) {
			if (other.pedidoModel != null)
				return false;
		} else if (!pedidoModel.equals(other.pedidoModel))
			return false;
		if (produtoModel == null) {
			if (other.produtoModel != null)
				return false;
		} else if (!produtoModel.equals(other.produtoModel))
			return false;
		return true;
	}
	
	
	
	public PedidoProdutoIdModel getPedidoProdutoIdModel() {
		return pedidoProdutoIdModel;
	}
	public void setPedidoProdutoIdModel(PedidoProdutoIdModel pedidoProdutoIdModel) {
		this.pedidoProdutoIdModel = pedidoProdutoIdModel;
	}
	/*
	public PedidoModel getPedidoModel() {
		return pedidoModel;
	}
	public void setPedidoModel(PedidoModel pedidoModel) {
		this.pedidoModel = pedidoModel;
	}
	
	public ProdutoModel getProdutoModel() {
		return produtoModel;
	}
	public void setProdutoModel(ProdutoModel produtoModel) {
		this.produtoModel = produtoModel;
	}*/
	public Float getQtdepedidoproduto() {
		return qtdepedidoproduto;
	}
	public void setQtdepedidoproduto(Float qtdepedidoproduto) {
		this.qtdepedidoproduto = qtdepedidoproduto;
	}
	public Float getValorunitariopedidoproduto() {
		return valorunitariopedidoproduto;
	}
	public void setValorunitariopedidoproduto(Float valorunitariopedidoproduto) {
		this.valorunitariopedidoproduto = valorunitariopedidoproduto;
	}
	public Float getValortotalpedidoproduto() {
		return valortotalpedidoproduto;
	}
	public void setValortotalpedidoproduto(Float valortotalpedidoproduto) {
		this.valortotalpedidoproduto = valortotalpedidoproduto;
	}
	public String getUnidadepedidoproduto() {
		return unidadepedidoproduto;
	}
	public void setUnidadepedidoproduto(String unidadepedidoproduto) {
		this.unidadepedidoproduto = unidadepedidoproduto;
	}

	
	
}
