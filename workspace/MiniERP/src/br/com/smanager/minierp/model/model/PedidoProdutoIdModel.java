package br.com.smanager.minierp.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PedidoProdutoIdModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "numero_pedido")
	private Long numeropedido;
	
	@Column(name = "codigo_produto")
	private Long codigoproduto;

	
	public PedidoProdutoIdModel() {}
	public PedidoProdutoIdModel(Long numeropedido, Long codigoproduto) {
		super();
		this.numeropedido = numeropedido;
		this.codigoproduto = codigoproduto;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoproduto == null) ? 0 : codigoproduto.hashCode());
		result = prime * result + ((numeropedido == null) ? 0 : numeropedido.hashCode());
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
		PedidoProdutoIdModel other = (PedidoProdutoIdModel) obj;
		if (codigoproduto == null) {
			if (other.codigoproduto != null)
				return false;
		} else if (!codigoproduto.equals(other.codigoproduto))
			return false;
		if (numeropedido == null) {
			if (other.numeropedido != null)
				return false;
		} else if (!numeropedido.equals(other.numeropedido))
			return false;
		return true;
	}
	public Long getNumeropedido() {
		return numeropedido;
	}
	public void setNumeropedido(Long numeropedido) {
		this.numeropedido = numeropedido;
	}
	public Long getCodigoproduto() {
		return codigoproduto;
	}
	public void setCodigoproduto(Long codigoproduto) {
		this.codigoproduto = codigoproduto;
	}
	
	
}
