package br.com.smanager.minierp.model.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "pedido")
public class PedidoModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_pedido")
	Integer numeropedido;
	
	@Column(name = "data_pedido", nullable = false)
	Calendar datapedido;
	
	@Column(name = "operacao_pedido", nullable = true, length = 1)
	String operacaopedido;
	
	@Column(name = "pesobruto_pedido", nullable = true)
	Float pesobrutopedido;
	
	@Column(name = "pesoliquido_pedido", nullable = true)
	Float pesoliquidopedido;
	
	@Column(name = "valorproduto_pedido", nullable = true)
	Float valortotalprodutopedido;
	
	@Column(name = "valor_pedido", nullable = true)
	Float valortotalpedido;
	
	@Column(name = "frete_pedido", nullable = true)
	Float fretepedido;
	
	@Column(name = "seguro_pedido", nullable = true)
	Float valorseguro;
	
	@Column(name = "desconto_pedido", nullable = true)
	Float totaldescontopedido;
		
	
	@ManyToMany
	@JoinTable(
			name="pedido_produto",
			joinColumns = {@JoinColumn(name = "numero_pedido")},
			inverseJoinColumns = {@JoinColumn(name = "codigo_produto")})
	private List<ProdutoModel> produtos;
	
	@ManyToOne
	@JoinColumn(name = "cliente", referencedColumnName = "codigo_cliente", nullable = false)
	ClienteModel clienteModel;
	
	/*
	@Column(table = "pedido_produto", name = "itemtotal_produto", nullable = true)
	Float itemtotalproduto;
	
	@Column(table = "pedido_produto", name = "itemquantidade_produto", nullable = true)
	Float itemquantidadeproduto;
	
	@Column(table = "pedido_produto", name = "itemunitario_produto", nullable = true)
	Float itemunitarioproduto;
	*/

	public ClienteModel getClienteModel() {
		return clienteModel;
	}

	public void setClienteModel(ClienteModel clienteModel) {
		this.clienteModel = clienteModel;
	}

	//getters e setters
	public Integer getNumeropedido() {
		return numeropedido;
	}

	public void setNumeropedido(Integer numeropedido) {
		this.numeropedido = numeropedido;
	}

	public Calendar getDatapedido() {
		return datapedido;
	}

	public void setDatapedido(Calendar datapedido) {
		this.datapedido = datapedido;
	}

	public String getOperacaopedido() {
		return operacaopedido;
	}

	public void setOperacaopedido(String operacaopedido) {
		this.operacaopedido = operacaopedido;
	}

	public Float getPesobrutopedido() {
		return pesobrutopedido;
	}

	public void setPesobrutopedido(Float pesobrutopedido) {
		this.pesobrutopedido = pesobrutopedido;
	}

	public Float getPesoliquidopedido() {
		return pesoliquidopedido;
	}

	public void setPesoliquidopedido(Float pesoliquidopedido) {
		this.pesoliquidopedido = pesoliquidopedido;
	}

	public Float getValortotalprodutopedido() {
		return valortotalprodutopedido;
	}

	public void setValortotalprodutopedido(Float valortotalprodutopedido) {
		this.valortotalprodutopedido = valortotalprodutopedido;
	}

	public Float getValortotalpedido() {
		return valortotalpedido;
	}

	public void setValortotalpedido(Float valortotalpedido) {
		this.valortotalpedido = valortotalpedido;
	}

	public Float getFretepedido() {
		return fretepedido;
	}

	public void setFretepedido(Float fretepedido) {
		this.fretepedido = fretepedido;
	}

	public Float getValorseguro() {
		return valorseguro;
	}

	public void setValorseguro(Float valorseguro) {
		this.valorseguro = valorseguro;
	}

	public Float getTotaldescontopedido() {
		return totaldescontopedido;
	}

	public void setTotaldescontopedido(Float totaldescontopedido) {
		this.totaldescontopedido = totaldescontopedido;
	}

	public List<ProdutoModel> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoModel> produtos) {
		this.produtos = produtos;
	}
	
	public PedidoModel() {}

	public PedidoModel(Integer numeropedido, Calendar datapedido, String operacaopedido, Float pesobrutopedido,
			Float pesoliquidopedido, Float valortotalprodutopedido, Float valortotalpedido, Float fretepedido,
			Float valorseguro, Float totaldescontopedido, List<ProdutoModel> produtos) {
		this.numeropedido = numeropedido;
		this.datapedido = datapedido;
		this.operacaopedido = operacaopedido;
		this.pesobrutopedido = pesobrutopedido;
		this.pesoliquidopedido = pesoliquidopedido;
		this.valortotalprodutopedido = valortotalprodutopedido;
		this.valortotalpedido = valortotalpedido;
		this.fretepedido = fretepedido;
		this.valorseguro = valorseguro;
		this.totaldescontopedido = totaldescontopedido;
		this.produtos = produtos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		PedidoModel other = (PedidoModel) obj;
		if (numeropedido == null) {
			if (other.numeropedido != null)
				return false;
		} else if (!numeropedido.equals(other.numeropedido))
			return false;
		return true;
	}
	
	
	
}
