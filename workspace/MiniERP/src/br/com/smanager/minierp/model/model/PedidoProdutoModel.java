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

	@Column(name = "qtde_pedidoproduto", nullable = true)
	Float qtdepedidoproduto;
	
	@Column(name = "valorunitario_pedidoproduto", nullable = true)
	Float valorunitariopedidoproduto;
	
	@Column(name = "valortotal_pedidoproduto", nullable = false)
	Float valortotalpedidoproduto;
	
	@Column(name = "unidade_pedidoproduto", nullable = true, length = 6)
	String unidadepedidoproduto;
	
	

	public PedidoProdutoModel() {}
	public PedidoProdutoModel(Long codigoitempedido, Float qtdepedidoproduto, Float valorunitariopedidoproduto,
			Float valortotalpedidoproduto, String unidadepedidoproduto) {
		super();
		this.codigoitempedido = codigoitempedido;
		this.qtdepedidoproduto = qtdepedidoproduto;
		this.valorunitariopedidoproduto = valorunitariopedidoproduto;
		this.valortotalpedidoproduto = valortotalpedidoproduto;
		this.unidadepedidoproduto = unidadepedidoproduto;
	}
	
	
	
	public Long getCodigoitempedido() {
		return codigoitempedido;
	}
	public void setCodigoitempedido(Long codigoitempedido) {
		this.codigoitempedido = codigoitempedido;
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
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoitempedido == null) ? 0 : codigoitempedido.hashCode());
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
		if (codigoitempedido == null) {
			if (other.codigoitempedido != null)
				return false;
		} else if (!codigoitempedido.equals(other.codigoitempedido))
			return false;
		return true;
	}
	
	
}
