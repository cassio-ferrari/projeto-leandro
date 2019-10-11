package br.com.smanager.minierp.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido_produto")
public class PedidoProdutoModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "codigo_pedidoproduto")
	private Long  codigoitempedido;
	
	@ManyToOne
	@JoinColumn(name = "numeropedido_pedidoproduto", nullable = false, referencedColumnName = "numero_pedido")
	PedidoModel pedidoModel;
	
	@ManyToOne
	@JoinColumn(name = "produto_pedidoproduto", nullable = false, referencedColumnName = "codigo_produto")
	ProdutoModel produtoModel;
	
	@Column(name = "qtde_pedidoproduto", nullable = false)
	Float qtdepedidoproduto;
	
	@Column(name = "valorunitario_pedidoproduto", nullable = false)
	Float valorunitariopedidoproduto;
	
	@Column(name = "valortotal_pedidoproduto", nullable = false)
	Float valortotalpedidoproduto;
	
	@Column(name = "unidade_pedidoproduto", nullable = true, length = 6)
	String unidadepedidoproduto;

}
