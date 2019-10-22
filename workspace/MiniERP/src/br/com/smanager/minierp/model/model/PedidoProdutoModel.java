package br.com.smanager.minierp.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "pedido_produto")
public class PedidoProdutoModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_pedidoproduto")
	private Long  codigoitempedido;
	
	@ManyToOne
	@JoinColumn(name = "numeropedido_pedidoproduto", nullable = false, referencedColumnName = "numero_pedido")
	PedidoModel pedidoModel;
	
	@ManyToOne
	@JoinColumn(name = "produto_pedidoproduto", nullable = false, referencedColumnName = "codigo_produto")
	ProdutoModel produtoModel;
	
	@Column(name = "qtde_pedidoproduto", nullable = true)
	Float qtdepedidoproduto;
	
	@Column(name = "valorunitario_pedidoproduto", nullable = true)
	Float valorunitariopedidoproduto;
	
	@Column(name = "valortotal_pedidoproduto", nullable = false)
	Float valortotalpedidoproduto;
	
	@Column(name = "unidade_pedidoproduto", nullable = true, length = 6)
	String unidadepedidoproduto;
	
	//@Column(name = "ncm_pedidoproduto", nullable = true, length = 8)
	//String ncmpedidoproduto;

	//public String getNcmpedidoproduto() {
	//	return ncmpedidoproduto;
	//}

	//public void setNcmpedidoproduto(String ncmpedidoproduto) {
	//	this.ncmpedidoproduto = ncmpedidoproduto;
	//}

	public Long getCodigoitempedido() {
		return codigoitempedido;
	}

	public void setCodigoitempedido(Long codigoitempedido) {
		this.codigoitempedido = codigoitempedido;
	}

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
	}

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

	public PedidoProdutoModel() {};
	public PedidoProdutoModel(Long codigoitempedido, PedidoModel pedidoModel, ProdutoModel produtoModel,
			Float qtdepedidoproduto, Float valorunitariopedidoproduto, Float valortotalpedidoproduto,
			String unidadepedidoproduto) {
		super();
		this.codigoitempedido = codigoitempedido;
		this.pedidoModel = pedidoModel;
		this.produtoModel = produtoModel;
		this.qtdepedidoproduto = qtdepedidoproduto;
		this.valorunitariopedidoproduto = valorunitariopedidoproduto;
		this.valortotalpedidoproduto = valortotalpedidoproduto;
		this.unidadepedidoproduto = unidadepedidoproduto;
	}

	//construtor para teste inserção backend
	public PedidoProdutoModel(ProdutoModel produtoModel,
			Float qtdepedidoproduto, Float valorunitariopedidoproduto, Float valortotalpedidoproduto) {
		super();
		this.produtoModel = produtoModel;
		this.qtdepedidoproduto = qtdepedidoproduto;
		this.valorunitariopedidoproduto = valorunitariopedidoproduto;
		this.valortotalpedidoproduto = valortotalpedidoproduto;
	}
	
}
